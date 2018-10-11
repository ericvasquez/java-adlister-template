<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%!
    int counter = 0;
%>
<html>
<head>
    <jsp:include page="partials/header.jsp">
        <jsp:param name="title" value="Home"></jsp:param>
    </jsp:include>
</head>
<body>

<jsp:include page="partials/navbar.jsp">
    <jsp:param name="role" value="admin"></jsp:param>
</jsp:include>

<%--<%@ include file="navbar.jsp" %>--%>

<%
    counter += 1;
%>

<!-- fer -->

<%-- Fer is teaching --%>
<h1><%= counter %></h1>

<div>
    <p>Path: <%= request.getRequestURL() %></p>
    <p>Query String: <%= request.getQueryString() %></p>
    <p>"name" parameter: <%= request.getParameter("name") %></p>
    <p>"name" parameter with EL: ${param.name}</p>
    <p>User-Agent header: <%= request.getHeader("user-agent") %></p>
</div>

<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>

<c:forEach var="item" begin="1" end="30">
    <c:choose>

        <c:when test="${item % 15 == 0}">
            <p>Fizzbuzz</p>
        </c:when>
        <c:when test="${item % 3 == 0}">
            <p>Fizz</p>
        </c:when>
        <c:when test="${item % 5 == 0}">
            <p>Buzz</p>
        </c:when>
        <c:otherwise>
            <p>${item}</p>
        </c:otherwise>
    </c:choose>
</c:forEach>

<jsp:include page="partials/footer.jsp"/>

</body>
</html>
