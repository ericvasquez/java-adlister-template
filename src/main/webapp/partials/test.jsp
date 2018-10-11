<%--
  Created by IntelliJ IDEA.
  User: daniel
  Date: 10/11/18
  Time: 9:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<h2>Here we are in jstltest.jsp</h2>
<p>${param.title}</p>

<c:if test="${param.i == 3}">
    <p>i is 3</p>
</c:if>

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

