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


<h1>Import Product catalog</h1>

	<!-- javascript for checking, if a file is selected -->
	
	<script type="text/javascript">
		function submitOrError(){
			if(document.getElementById("File").value !== ""){
				document.getElementById("upload").submit();
			} else {
				alert("Please select a File!");
			}	
		}
	</script>

	<!-- Formular for importing of products -->
	
	<form id="upload" name="upload" action="controllerservlet?action=import" enctype="multipart/form-data" method="POST">
		<table>
			<tr>
				<td>Selected File:</td>
				<td><input type="file" name="File" id="File"/></td>
			</tr>
			<tr>
				<td>Importing Format:</td>
				<td><select name="role" size="1">
						<option value="1" selected>XML</option>
						<option value="2">XHTML</option>
					</select></td>
			</tr>
		</table>
		
		<p><input type="button" value="Upload" onclick="submitOrError()"/></p>

</body>
</html>
