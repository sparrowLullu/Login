<%-- 
    Document   : Welcome
    Created on : Nov 26, 2018, 11:36:30 AM
    Author     : TheOS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>WElcome</p>
        <%
		if (session != null) {
			if (session.getAttribute("user") != null) {
				String name = (String) session.getAttribute("user");
				out.print("Hello, " + name + "  Welcome to ur Profile");
			} else {
				response.sendRedirect("login1.jsp");
			}
		}
	%>
        <form action="/Register_Version1/Logout" method="post">
		<input type="submit" value="Logout">
	</form>
    </body>
</html>
