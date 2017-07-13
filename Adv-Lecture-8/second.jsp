<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jai mata di</title>
</head>
<body>
	<%!int show(int x) {
		return (x - 5);
	}%>

	<%!int i = 10;%>
	<%
		out.println("Hello Worlds!");
		application.setAttribute("job", "Developer");
		pageContext.setAttribute("gender", "male", PageContext.PAGE_SCOPE);
	%>
	<%=i%>
	<%=show(100)%>
	<%=application.getAttribute("job")%>
	<%=pageContext.getAttribute("gender", PageContext.PAGE_SCOPE)%>
</body>
</html>