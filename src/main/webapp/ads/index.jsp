<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 10/15/18
  Time: 9:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>AdLister</title>

</head>
<body>
    <h1>AdLister</h1>

    <ul>
    <c:forEach var="ad" items="${adsList}">
        <li><h3>${ad.title}</h3>
            <p>${ad.description}</p>
        </li>
    </c:forEach>
    </ul>
</body>
</html>
