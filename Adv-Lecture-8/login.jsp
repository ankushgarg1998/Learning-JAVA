<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<%
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		out.println("<html><body><h1>");
		if (name.equals("ankush") && pass.equals("garg"))
			out.println("Valid");
		else
			out.println("Invalid");
		out.println("</h2></body></html>");
	%>

</body>
</html>