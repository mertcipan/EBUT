<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" indent="yes"/>
		<xsl:template match="/">
			<xml>
				<xsl:apply-templates select="ROOT"/>
			</xml>
	</xsl:template>
	
	<xsl:template match="Header">
		<xsl:for-each select="CATALOG/*">
			<xsl:element name="Hallo">
				<xsl:value-of select="node()"/>
			</xsl:element>
		</xsl:for-each>
	</xsl:template>
		
	
</xsl:stylesheet>