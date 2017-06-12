<%@ page session="true" import="de.htwg_konstanz.ebus.framework.wholesaler.api.bo.*,de.htwg_konstanz.ebus.framework.wholesaler.api.boa.*,de.htwg_konstanz.ebus.wholesaler.demo.util.Constants,java.util.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>eBusiness Framework Demo - Export</title>
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="pragma" content="no-cache">
<link rel="stylesheet" type="text/css" href="default.css">
<link rel="stylesheet" type="text/css" href="layout.css">
</head>

<body>

<%@ include file="header.jsp" %>
<%@ include file="error.jsp" %>
<%@ include file="authentication.jsp" %>
<%@ include file="navigation.jspfragment" %>

<h1>Export Product Catalog Matching Short Description</h1>
<table class="dataTable">
	<tr>
		<th>Export Matching Products</th>
		<th colspan="2">View</th>
		<th colspan="1">Download</th>
	</tr>
	<tr>
		<td>
			<form id="searchForm" method="post" action="controllerservlet?action=export">
				<input type="hidden" name="view" id="view"/>
				<input type="hidden" name="download" id="download"/>
				<input type="text" name="search" id="search" placeholder="SEARCHING TEXT"/>
				<input type="reset" value="Reset">
			</form> 
		</td>
		<script>
			function submitScript(view, download) {
				if(document.getElementById("search").value !== ""){
						document.getElementById("view").value = view;
						document.getElementById("download").value = download;
						document.getElementById("searchForm").submit();				
				} 
				else {
					alert("Please type in some text!");
				}	
				
			}
		</script>
		<td><button onclick="submitScript('BMECAT');">BMECAT</button></td>
		<td><button onclick="submitScript('XHTML');">XHTML</button></td>
		<td><button onclick="submitScript('BMECAT','yes');">BMECAT</button></td>
	</tr>	
</table>
<p></p>
<h1>Export Whole Product Catalog</h1>
<table class="dataTable">
	<tr>
		<th colspan="2">View</th>
		<th colspan="1">Download</th>
	</tr>
	<tr>
		<td>
			<form method ="post" action="controllerservlet?action=export&view=BMECAT">
				<button type="submit">BMECAT</button>
			</form>
		</td>
		<td>
			<form method ="post" action="controllerservlet?action=export&view=XHTML">
				<button type="submit">XHTML</button>
			</form>
		</td>
		<td>
			<form method ="post" action="controllerservlet?action=export&view=BMECAT&download=yes">
				<button type="submit">BMECAT</button>
			</form>
		</td>
	</tr>
</table>
<p>
<input type=button name=go-back value=" back " onclick="javascript:history.back()">
</p>
</body>
</html>
