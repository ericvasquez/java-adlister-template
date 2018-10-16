<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Author" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">

        <div class="col-md-6">
            <p>${author.id}</p>
            <h2>${author.first_name}</h2>
            <p>${author.last_name}</p>
        </div>

</div>

</body>
</html>
