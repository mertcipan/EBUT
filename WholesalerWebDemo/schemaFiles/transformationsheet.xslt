<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="xml" doctype-system="http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd" doctype-public="-//W3C//DTD XHTML 1.0 Transitional//EN" indent="yes"/>
		<xsl:template match="/">
			<html xmlns="http://www.w3.org/1999/xhtml">
				 <head>
				   <title><xsl:value-of select="BMECAT/HEADER/CATALOG/CATALOG_NAME"/></title>
				   <link rel="stylesheet" type="text/css" href="layout.css" />
				   <link rel="stylesheet" type="text/css" href="default.css" />
				 </head>
				 <body>
					 <xsl:apply-templates select="BMECAT"/>
				 </body>
			 </html>
	</xsl:template>
		
	<xsl:template match="HEADER">
		<table class="dataTable" border="2">
		<thead>
			<tr>
				<xsl:for-each select="CATALOG/*">
					<th><b><xsl:value-of select ="local-name()"/></b></th>
				</xsl:for-each>
			</tr>
		</thead>
		<tbody>
			<tr>
				<xsl:for-each select="CATALOG/*">
					<td><xsl:value-of select="node()"/></td>
				</xsl:for-each>
			</tr>
		</tbody>
		</table>
		<h1><xsl:value-of select ="local-name(//SUPPLIER_NAME)"/><xsl:text>: </xsl:text><xsl:value-of select="//SUPPLIER_NAME"/></h1>
	</xsl:template>
	

	<xsl:template match="//SUPPLIER_AID">
	<h2>Artikel_ID: <xsl:value-of select ="node()"/></h2>
	</xsl:template>	
	
	<xsl:template match="//ARTICLE_DETAILS">
		<h3><xsl:text>ARTICLE INFORMATION</xsl:text></h3>
		<table border="1">
			<thead>
				<tr>
					<xsl:for-each select="*">
						<th><b><xsl:value-of select ="local-name()"/></b></th>
					</xsl:for-each>
				</tr>
			</thead>
			<tbody>
				<tr>
					<xsl:for-each select="*">
						<td><xsl:value-of select ="node()"/></td>
					</xsl:for-each>
				</tr>
			</tbody>
		</table>
	</xsl:template>

	<xsl:template name="order" match="//ARTICLE_ORDER_DETAILS">
		<h3><xsl:text>ORDER DETAILS</xsl:text></h3>
		<table border="1">
		<thead>
			<tr>
				<xsl:for-each select="*">
					<th><b><xsl:value-of select ="local-name()"/></b></th>
				</xsl:for-each>
			</tr>
		</thead>
		<tbody>
			<tr>
				<xsl:for-each select="*">
					<td><xsl:value-of select ="node()"/></td>
				</xsl:for-each>
			</tr>
		</tbody>
	</table>
	</xsl:template>
	
	<xsl:template match="//ARTICLE_PRICE_DETAILS">
		<h3><xsl:text>ALL AVAILABLE PRICE DETAILS</xsl:text></h3>
		<xsl:apply-templates/>
	</xsl:template>
	
	<xsl:template match="//ARTICLE_PRICE">
		<h3><xsl:text>PRICE</xsl:text></h3>
		<table border="1">
		<thead>
			<tr>
				<xsl:for-each select="*">
					<th><b><xsl:value-of select ="local-name()"/></b></th>
				</xsl:for-each>
			</tr>
		</thead>
		<tbody>
			<tr>
			<xsl:for-each select="*">
					<td><xsl:value-of select ="node()"/></td>
				</xsl:for-each>
			</tr>
		</tbody>
	</table>
	</xsl:template>	
	
	<xsl:template match="//ARTICLE_REFERENCE/ART_ID_TO">
		<h4>ARTIKEL HAT EINE REFERENZ AUF: <xsl:value-of select="node()"/><xsl:text>: </xsl:text></h4>
	</xsl:template>	
	
</xsl:stylesheet>