<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    
  <xsl:output omit-xml-declaration="yes" indent="yes"/>
  
  <xsl:template match="/booklist">
    <authors>
      <xsl:call-template name="RecursiveGrouping">
        <xsl:with-param name="list" select="book"/>
				<!-- <xsl:with-param name="attrList" select="/*/book[1]/@*[name() = 'author'] | /*/book[1]/@*[name() = 'title']"/> -->
				<xsl:with-param name="attrList" select="/*/book[1]/@*"/> 
      </xsl:call-template>
    </authors>
  </xsl:template>

  <xsl:template name="RecursiveGrouping">
    <xsl:param name="list"/>
    <xsl:param name="attrList"/>
    
    
    <xsl:if test="$attrList">
       <!-- Selecting the first attribute name as group identifier and the group
      itself-->
      <xsl:variable name="attrName" select="name($attrList[1])"/>
    
      <xsl:variable name="group-identifier" select="$list[1]/@*[name()
= $attrName]"/>
      <xsl:variable name="group"
select="$list[@*[name()=$attrName]=$group-identifier]"/>
      
       <!-- Do some work for the group -->
       <xsl:element name="{$attrName}">
         <xsl:attribute name="value">
           <xsl:value-of select="$group-identifier"/>
         </xsl:attribute>

          <xsl:call-template name="RecursiveGrouping">
            <xsl:with-param name="list" select="$group"/>
            <xsl:with-param name="attrList" select="$attrList[position() > 1]"/>
          </xsl:call-template>
       </xsl:element>
  
       <!-- If there are other groups left, calls itself -->
      <xsl:if test="count($list)>count($group)">
        <xsl:call-template name="RecursiveGrouping">
          <xsl:with-param name="list"
              select="$list[not(@*[name()=$attrName]=$group-identifier)]"/>
          <xsl:with-param name="attrList" select="$attrList"/>
        </xsl:call-template>
      </xsl:if>
    </xsl:if>
  </xsl:template>
</xsl:stylesheet>
