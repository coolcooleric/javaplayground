<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:math="xalan://mi.mis.actions.xmlInterface.output.TxtOperations">
  <xsl:output method="text"/>
  <xsl:variable name="policydata" select="document('/opt/camiant/mi/PolicyData.xml')/policy-data"/>
  <!-- Content: template -->
	<xsl:template match="/">
   <xsl:if test="count(//Policy) > 0">=============================================================================
Policies:<xsl:apply-templates select="//Policy"/>
   </xsl:if>
   <xsl:if test="count(//PolicyTemplate) > 0">=============================================================================
Policy Templates:<xsl:apply-templates select="//PolicyTemplate"/>
   </xsl:if>
   <xsl:if test="count(//PolicyGroup) > 0">
=============================================================================
Policy Groups:<xsl:apply-templates select="//PolicyGroup"/>
   </xsl:if>
	</xsl:template>
  
  <xsl:template match="Policy | PolicyTemplate">
    <xsl:variable name="actionValues" select="./ActionValues"/>
    <xsl:variable name="conditionValues" select="./ConditionValues"/>
    <xsl:variable name="conditionVars" select="./ConditionVariables"/>
----------------------------------------------------------------------------- 
 <xsl:value-of select="Name" /><xsl:text>

</xsl:text>
<!-- Condition String -->
   <xsl:call-template name="condition">
     <xsl:with-param name="values"><xsl:value-of select="$conditionValues"/></xsl:with-param>
     <xsl:with-param name="conditionVars"><xsl:value-of select="$conditionVars"/></xsl:with-param>
     <xsl:with-param name="space"></xsl:with-param>
     <xsl:with-param name="ignorespace">false</xsl:with-param>
   </xsl:call-template>
<xsl:text>
</xsl:text>
<!-- Action String -->
   <xsl:call-template name="condition">
     <xsl:with-param name="values"><xsl:value-of select="$actionValues"/></xsl:with-param>
     <xsl:with-param name="conditionVars"><xsl:value-of select="$conditionVars"/></xsl:with-param>
     <xsl:with-param name="space"></xsl:with-param>
   </xsl:call-template>
</xsl:template>
  
  <xsl:template match="PolicyGroup">
----------------------------------------------------------------------------- 
 <xsl:value-of select="Name" />
 
Policies:
<xsl:if test="count(ElementRef) = 0">  &lt;none&gt;
</xsl:if>
<xsl:if test="count(ElementRef) > 0">
<xsl:for-each select="ElementRef">
<xsl:text> </xsl:text><xsl:value-of select="Name" /><xsl:if test="position()!=last()">,</xsl:if>
</xsl:for-each>
</xsl:if>
  </xsl:template>
  
  <xsl:template name="condition">
    <xsl:param name="values"></xsl:param>
    <xsl:param name="conditionVars"></xsl:param>
    <xsl:param name="space"></xsl:param>
    <xsl:param name="ignorespace"></xsl:param>
      
    <xsl:if test="math:has($values)">
      <xsl:variable name="value" select="math:shift($values)"/>
          <xsl:variable name="id" select="math:conditionId($value)"/>
<xsl:text> </xsl:text><xsl:if test="$ignorespace = 'false'"><xsl:value-of select="$space"/></xsl:if><xsl:value-of select="math:message($value, $policydata//entry[@id=$id]/display-text, $conditionVars)" /><xsl:text>
</xsl:text>
     <xsl:call-template name="condition">
       <xsl:with-param name="values"><xsl:value-of select="math:next($values)"/></xsl:with-param>
       <xsl:with-param name="conditionVars"><xsl:value-of select="$conditionVars"/></xsl:with-param>
       <xsl:with-param name="space"> and </xsl:with-param>
       <xsl:with-param name="ignorespace"><xsl:value-of select="$ignorespace"/></xsl:with-param>
     </xsl:call-template>
    </xsl:if>
  </xsl:template>
  
</xsl:stylesheet>