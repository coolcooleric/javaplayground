<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="text"/>
	<xsl:strip-space elements="*"/> 
	<xsl:template match="/">
<!--  <xsl:result-document href="file:///output.java"> -->
public class output{
		<xsl:apply-templates/>
}
	<!-- </xsl:result-document> -->
	</xsl:template>
	<xsl:template match="class">
  public void genGui4<xsl:value-of select="@name"/><xsl:text>(HashMap statValues, ArrayList statNames){
    </xsl:text>
	  <xsl:for-each select="group">
		  <xsl:for-each select="pair">
				<xsl:if test="count(field) = 1">
				  <xsl:variable name="fieldName" select="field[1]/@name"/>
    addSingleStatForDisplay(&quot;<xsl:value-of select="document('mapping.xml')/mapping/entry[@field=$fieldName]/@key"/>&quot;<xsl:text>, statValues, statNames, </xsl:text>
		       <xsl:call-template name="convertType">
		         <xsl:with-param name="convert" select="field[1]/@convert"/>
		       </xsl:call-template><xsl:text>);
</xsl:text>
				</xsl:if>
				<xsl:if test="count(field) > 1">
    addMultipleStatsForDisplay(new String[] {<xsl:call-template name="convertKey">
				    <xsl:with-param name="fields" select="field"/>
				  </xsl:call-template>
		<xsl:text>}, statValues, statNames, </xsl:text>
		       <xsl:call-template name="convertSep">
		         <xsl:with-param name="sep" select="field[1]"/>
		       </xsl:call-template><xsl:text>);
</xsl:text>
				</xsl:if>
		  </xsl:for-each>
    statsName.add("");<xsl:text>
    </xsl:text>
		</xsl:for-each>
  }<xsl:text>
</xsl:text>
	</xsl:template>
	<xsl:template name="convertKey">
	  <xsl:param name="fields"/>
	  <xsl:for-each select="$fields"> 
		  <xsl:text>"</xsl:text><xsl:value-of select="document('mapping.xml')/mapping/entry[@field=current()/@name]/@key"/><xsl:text>"</xsl:text>
      <xsl:if test="position()!=last()">
      <xsl:text>,</xsl:text>
      </xsl:if>
		</xsl:for-each>
	</xsl:template>

	<xsl:template name="convertType">
	  <xsl:param name="convert"/>
		  <xsl:text>MiConstants.StatCounterConversionType.</xsl:text>
		  <xsl:choose>
      	<xsl:when test="$convert=0">
      		<xsl:text>NONE</xsl:text>
      	</xsl:when>
      	<xsl:when test="$convert=1">
      		<xsl:text>DATETIME</xsl:text>
      	</xsl:when>
      	<xsl:when test="$convert=2">
      		<xsl:text>DOUBLE_TO_LONG</xsl:text>
      	</xsl:when>
      	<xsl:when test="$convert=3">
      		<xsl:text>CONNECTIONS</xsl:text>
      	</xsl:when>
      	<xsl:when test="$convert=4">
      		<xsl:text>IPV4ADDRESS</xsl:text>
      	</xsl:when>
      	<xsl:otherwise>
      		<xsl:text>NGOD_OPERSTATE</xsl:text>
      	</xsl:otherwise>
      </xsl:choose>
	</xsl:template>
	<xsl:template name="convertSep">
	  <xsl:param name="sep"/>
		  <xsl:text>MiConstants.</xsl:text>
		  <xsl:choose>
      	<xsl:when test="$sep/@sep=1">
      		<xsl:text>DISPLAY_STATS_ADDR_PORT_SEPARATOR</xsl:text>
      	</xsl:when>
      	<xsl:otherwise>
      		<xsl:text>DISPLAY_STATS_SEPARATOR</xsl:text>
      	</xsl:otherwise>
      </xsl:choose>
	</xsl:template>
</xsl:stylesheet>
