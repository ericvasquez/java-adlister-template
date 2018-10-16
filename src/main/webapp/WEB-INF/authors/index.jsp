<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The authors" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">

    <c:forEach var="author" items="${authors}">
        <div class="col-md-6">
            <p>${author.id}</p>
            <h2>${author.first_name}</h2>
            <p>${author.last_name}</p>
        </div>
    </c:forEach>
</div>

</body>
</html>
