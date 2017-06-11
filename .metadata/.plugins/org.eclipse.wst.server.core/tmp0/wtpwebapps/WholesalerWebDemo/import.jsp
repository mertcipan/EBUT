<%@ page session="true" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
<head>
<title>eBusiness Framework Demo - Welcome</title>
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="pragma" content="no-cache">
<link rel="stylesheet" type="text/css" href="default.css">
</head>
<body>

<%@ include file="header.jsp" %>
<%@ include file="error.jsp" %>
<%@ include file="authentication.jsp" %>
<%@ include file="navigation.jspfragment" %>


<h1>Import product catalog</h1>

	<!-- Formular for importing of products -->
	<form name="importForm" method="post">
		<table>
			<tr>
				<td>File:</td>
				<td><input name="file" value="" /></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
			<tr>
				<td>Importing Format:</td>
				<td><select name="role" size="1">
						<option value="1" selected>XML</option>
						<option value="2">XHTML</option>
				</select></td>
			</tr>
		</table>
		<p>
			<input type="submit" name="import-Products" value="Import" >
		</p>

</body>
</html>
