<?xml version="1.0"?> 
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="text"/>

<xsl:param name="dir"/>
<xsl:param name="package"/>

<xsl:template match="database">
  <xsl:apply-templates select="class[@custom = 'net']"/>
</xsl:template>

<xsl:template match="class">
  <xsl:result-document href="file:///{$dir}/{@name_cap}_Data.java">
  <xsl:variable name="name_cap" select="@name_cap"/>

/**
 * Copyright (C) 2003 Chameleon Solutions Inc. All Rights Reserved.
 * 
 * This file contains material that is confidential and proprietary
 * to Chameleon Solutions, Inc.  No part of this file may be reproduced
 * or transmitted in any form or by any means, electronic or
 * mechanical, for any purpose, without the express permission of
 * Chameleon Solutions, Inc.
 * 
 * WARNING: This file is generated and should not be edited.
 */

package <xsl:value-of select="$package"/>;

/**
 * Beans for passing <xsl:value-of select="@name_cap"/> data over the
 * network from the MI Server to the MI Agent.
 */
public class <xsl:value-of select="@name_cap"/>_Data {
  <xsl:for-each select="field[@custom = 'net']">
    <xsl:variable name="nettype">
      <xsl:choose>
        <xsl:when test="@javatype = 'timestamp'">String</xsl:when>
        <xsl:when test="@dbobject = 'table'"><xsl:value-of select="@name_cap"/>_Data</xsl:when>
        <xsl:otherwise><xsl:value-of select="@javatype"/></xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
  private <xsl:value-of select="$nettype"/><xsl:text> </xsl:text><xsl:value-of select="@name_var"/>;
  </xsl:for-each>
  <xsl:for-each select="complex-field[@custom = 'net']">
  private <xsl:value-of select="@child_cap"/>_Data[] <xsl:value-of select="@attribute_var"/>;
  </xsl:for-each>
  <xsl:for-each select="group-fields[ @custom = 'net']">
  private <xsl:value-of select="@item_cap"/>_Data[] <xsl:value-of select="@item_var"/>;
  </xsl:for-each>

  /**
   * Constructor.
   */
  public <xsl:value-of select="@name_cap"/>_Data() {
  }

  <xsl:for-each select="field[@custom = 'net']">
    <xsl:variable name="nettype">
      <xsl:choose>
        <xsl:when test="@javatype = 'timestamp'">String</xsl:when>
        <xsl:when test="@dbobject = 'table'"><xsl:value-of select="@name_cap"/>_Data</xsl:when>
        <xsl:otherwise><xsl:value-of select="@javatype"/></xsl:otherwise>
      </xsl:choose>
    </xsl:variable>
  /**
   * Get the attribute <xsl:value-of select="@name_var"/>.
   *
   * @return <xsl:value-of select="@name_var"/>
   */
  public <xsl:value-of select="$nettype"/><xsl:text> </xsl:text><xsl:value-of select="@get_prefix"/><xsl:value-of select="@name_cap"/>() {
    return <xsl:value-of select="@name_var"/>;
  }

  /**
   * Set the attribute <xsl:value-of select="@name_var"/>.
   *
   * @param <xsl:value-of select="@name_var"/> the value
   */
  public void set<xsl:value-of select="@name_cap"/>(<xsl:value-of select="$nettype"/><xsl:text> </xsl:text><xsl:value-of select="@name_var"/>) {
    this.<xsl:value-of select="@name_var"/> = <xsl:value-of select="@name_var"/>;
  }
  </xsl:for-each>
  <xsl:for-each select="complex-field[@custom = 'net']">
  /**
   * Get the attribute <xsl:value-of select="@attribute_var"/>.
   *
   * @return an array of <xsl:value-of select="@child_cap"/>_Data
   */
  public <xsl:value-of select="@child_cap"/>_Data[] get<xsl:value-of select="@attribute_cap"/>s() {
    return <xsl:value-of select="@attribute_var"/>;
  }

  /**
   * Set the attribute <xsl:value-of select="@attribute_var"/>.
   *
   * @param <xsl:value-of select="@attribute_var"/> an array of <xsl:value-of select="@child_cap"/>_Data
   */
  public void set<xsl:value-of select="@attribute_cap"/>s(<xsl:value-of select="@child_cap"/>_Data[]<xsl:text> </xsl:text><xsl:value-of select="@attribute_var"/>) {
    this.<xsl:value-of select="@attribute_var"/> = <xsl:value-of select="@attribute_var"/>;
  }

  </xsl:for-each>
  <xsl:for-each select="group-fields[@custom = 'net']">
  /**
   * Get all <xsl:value-of select="@item_cap"/>_Datas for this <xsl:value-of select="@group_cap"/>_Data.
   *
   * @return an array of <xsl:value-of select="@item_cap"/>_Datas.
   */
  public <xsl:value-of select="@item_cap"/>_Data[] get<xsl:value-of select="@item_cap"/>s() {
    return <xsl:value-of select="@item_var"/>;
  }

  /**
   * Set an array of <xsl:value-of select="@item_cap"/>_Datas.
   */
  public void set<xsl:value-of select="@item_cap"/>s(<xsl:value-of select="@item_cap"/>_Data[] beans) {
    <xsl:value-of select="@item_var"/> = beans;
  }
  </xsl:for-each>
}
  </xsl:result-document>
</xsl:template>

</xsl:stylesheet>
