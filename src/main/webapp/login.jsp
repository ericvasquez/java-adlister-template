<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String user = request.getParameter("username");
    String pass = request.getParameter("password");

    if(user != null && pass != null) {
        if (user.equals("admin") && pass.equals("password")) {
            response.sendRedirect("/profile.jsp?role=admin");
        }
    }
%>

<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Login"></jsp:param>
    </jsp:include>
</head>
<body>

<form action="/login.jsp" method="post">
    <label for="username">Username</label>
    <input type="text" id="username" name="username">
    <label for="password">Password</label>
    <input type="password" id="password" name="password">
    <button>Submit</button>
</form>

</body>
</html>
