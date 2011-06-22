<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
	<xsl:output method="xml"/>
	<xsl:key name="gfield" match="field" use="@group"/>
	<xsl:key name="pfield" match="field" use="@pair"/>

	 <xsl:template match="database">
	   <xsl:apply-templates/>
	 </xsl:template>

	 <xsl:template match="class">
					 <class>
							<name>
										 <xsl:value-of select="@name"/>
							</name>
         <xsl:for-each select="field[generate-id() = generate-id(key('gfield', @group)[1])]">  
            <group>
               <xsl:for-each select="key('gfield', @group)">
                   <xsl:for-each select="field[generate-id() = generate-id(key('pfield', @pair)[1])]">  
													 <pair>
                             <xsl:for-each select="key('pfield', @pair)">
										           <xsl:copy-of select="."/>
														 </xsl:for-each>
													 </pair>
									 </xsl:for-each>
               </xsl:for-each>
            </group>
         </xsl:for-each>
		       </class>
	 </xsl:template>

</xsl:stylesheet>
