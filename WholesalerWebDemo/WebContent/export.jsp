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

<h1>Export</h1>

<form name="exportForm" method="post">
<table>
<tr><td>Short Description:</td><td><input name="description" value="" /></td></tr>
<tr><td>Exporting Format:</td><td>
<select name="role" size="1">
	<option value="1" selected>simple BMEcat XML</option>
	<option value="2">XHTML</option>
</select></td></tr>
</table>
<p>
<input type=button name=go-back value=" Back " onclick="javascript:history.back()">
<input type=button name=export-all value=" Export All " onclick="javascript:history.back()">
<input type="submit" name="find-Products" value="Find and Export">
<input type="reset" value="Reset">
</p>

</form>
</body>
</html>
