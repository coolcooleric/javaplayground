<@pp.dropOutputFile />
<@pp.changeOutputFile name="DiameterXmlGenHelper.java" />
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
import java.util.Map;
import mi.mis.beans.*;

  /**
  * Generating xml contents for all Diameter Stas
  */
public class DiameterXmlGenHelper {
<#list doc.database.class as class>
	<#if class.@name?contains("Diameter") && class.@name?contains("Stats")>
  /**
   * Gen xml contents that has delta attribute as head/true/tail
   * @param xml XML sample contents  
   * @param deltaBean stats bean
   * @param st start time string
   * @param et end time string
   * @param more user defined values to be added to the output
  */
  public static void generateXml(StringBuffer xml, ${class.@name}Bean deltaBean, String st, String et, Map<String,String> more) {  
    xml.append("\n\t\t<Sample>");
    xml.append("\n\t\t\t<StartTime>" + st + "</StartTime>");
    xml.append("\n\t\t\t<EndTime>" + et + "</EndTime>");
    addMore2Xml(xml, more);
   	<#list class.field as field>
          <#if field.@delta?has_content>
   		<#if field.@delta?has_content && field.@delta == "true" || field.@delta == "head"> 
    		<#list map.Mappings.mapping as mapping>
    			<#if mapping.@name == field.@name>
    xml.append("\n\t\t\t<"+ "${mapping.@xtag}" +">" + deltaBean.get${field.@name}() + "</"+ "${mapping.@xtag}"+">");
    			</#if>
    		</#list>
   		</#if>
          </#if>
  	</#list>
    xml.append("\n\t\t</Sample>");
  }
	</#if>
</#list>
 /**
  * Add user defined values
  * @param xml XML sample contents  
  * @param more user defined values to be added to the output
 */
  private static void addMore2Xml(StringBuffer xml, Map<String,String> more){
    for (Map.Entry<String,String> e : more.entrySet()){
      xml.append("\n\t\t\t<" + e.getKey() + ">" + e.getValue() + "</" + e.getKey() + ">");    
    } 
  }
}
