<@pp.dropOutputFile />
<@pp.changeOutputFile name="DiameterDeltaHelper.java" />
  /**
   * Copyright (C) 2004-2010 Camiant Inc. All Rights Reserved.
   *
   * This file contains material that is confidential and proprietary to
   * Camiant, Inc.  No part of this file may be reproduced or transmitted in
   * any form or by any means, electronic or  mechanical, for any purpose,
   * without the express permission of Camiant, Inc.
   *
   * WARNING: This file is generated and should not be edited.
   */

package mi.mis.actions.xmlInterface;
import mi.mis.beans.*;

  /**
  * Calculating deltas for all Diameter Stas
  */
public class DiameterDeltaHelper {
<#list doc.database.class as class>
	<#if class.@name?contains("Diameter") && class.@name?contains("Stats")>
  /**
   * Delta the stats beans and return a result bean
   * @param diameterStatsBeans bean array to be deltaed
   * @param isAbsoluteValues absolute flag
   * return ${class.@name}Bean the result bean after the delta processing 
   */
  public static ${class.@name}Bean calculateDeltaBean(${class.@name}Bean[] diameterStatsBeans, boolean isAbsoluteValues) {
    ${class.@name}Bean first = diameterStatsBeans[0];
    ${class.@name}Bean last = diameterStatsBeans[diameterStatsBeans.length - 1];
    ${class.@name}Bean deltaBean = new ${class.@name}BeanImpl();
		<#list class.field as field>    
			<#if field.@delta?has_content && field.@delta = "head">
    deltaBean.set${field.@name}(first.get${field.@name}());
			</#if>
		</#list>
    if ( isAbsoluteValues ) {  
		<#list class.field as field>        
			<#if field.@delta?has_content && field.@delta == "true">
      deltaBean.set${field.@name}(last.get${field.@name}());
      </#if>    
		</#list>
    } else {  
		<#list class.field as field>
			<#if field.@delta?has_content && field.@delta == "true">
      deltaBean.set${field.@name}(BaseXmlRequestAction.calcDelta(last.get${field.@name}(), first.get${field.@name}()));
      </#if>    
		</#list>
    }
    return deltaBean;
  }

</#if>
</#list>
}
