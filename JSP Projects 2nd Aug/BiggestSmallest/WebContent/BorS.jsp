<%@page errorPage="errorPage.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<!-- Directive tag: Page directive (imports java packages) 
	include directive (includes other files in you jsp)
	tag dir : includes custom tags
	-->
	
	<%@ include file="header.jsp"%>
	<%@ page import="java.util.Date"%>
	
	
	<!-- forwards the output to ms word file -->
	<%@ page contentType="application/msword"%>
	<!-- Scriptlet tag -->
	<%
		out.println("<h1 style='color : red'>"+(int)request.getAttribute("big")+"<br>");
		out.println("<h1 style='color : green'>"+(int)request.getAttribute("small")+"<br>");
	%>
	
	<!-- Declaration tag -->
	<%! 
			public int i = 0;
			public static String getName(){
				return "";
			}
	%>
	<!-- Expression tag: Shows output -->
	Date: <%= new java.util.Date() %>
</body>
</html>