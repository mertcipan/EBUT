<%@ page session="true"%>
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

	<%@ include file="header.jsp"%>
	<%@ include file="error.jsp"%>
	<%@ include file="authentication.jsp"%>
	<%@ include file="navigation.jspfragment"%>

	<h1>Export Matching Short Description</h1>

	<!-- Formular for exporting matching short description -->
	<form name="exportForm" method="post">
		<table>
			<tr>
				<td>Short Description:</td>
				<td><input name="description" value="" /></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
			<tr>
				<td>Exporting Format:</td>
				<td><select name="role" size="1">
						<option value="1" selected>XML</option>
						<option value="2">XHTML</option>
				</select></td>
			</tr>
		</table>
		<p>
			<input type="submit" name="show-Products" value="View" >
			<input type="submit" name="download-Products" value="Download">
		</p>

	<!-- Function to export all articles with option to choose in which format it should be exported-->
	</form>
	<h1>Export All</h1>
	<table>
		<tr>
			<td>Exporting Format:</td>
			<td><select name="role" size="1">
					<option value="1" selected>XML</option>
					<option value="2">XHTML</option>
			</select></td>
		</tr>
	</table>
	<p>
		<input type=button name=view-all value="View">
		<input type=button name=download-all value="Download">
	</p>
</body>
</html>
