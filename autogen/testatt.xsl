<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:output omit-xml-declaration="yes" indent="yes"/>

	<xsl:template match="/database/class/field[@group and @pair]">
	<xsl:copy-of select="."/>
  </xsl:template>

</xsl:stylesheet>
