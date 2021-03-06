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


<h1>Import Product Catalog</h1>

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
		<table class="dataTable">
			<tr>
				<th colspan="2">Option to upload a File</th>
			</tr>
			<tr>
				<td><input type="file" name="File" id="File"/></td>
				<td><input type="button" value="Upload" onclick="submitOrError()"/></td>
			</tr>

		</table>
	</form>
		

</body>
</html>
