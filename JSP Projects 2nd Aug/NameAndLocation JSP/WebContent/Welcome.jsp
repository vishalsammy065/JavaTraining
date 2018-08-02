<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome JSP</title>
</head>
<body>
	<%
		String msg = (String) request.getAttribute("msg");
		out.println("<h1>"+msg+ "</h1>");
	%>
</body>
</html>