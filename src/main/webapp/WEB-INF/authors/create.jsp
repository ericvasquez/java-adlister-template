<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Create a new Author" />
    </jsp:include>
</head>
<body>
    <div class="container">
        <h1>Create a new Author</h1>
        <form action="/authors/create" method="post">
            <div class="form-group">
                <label for="fn">First name</label>
                <input id="fn" name="fn" class="form-control" type="text">
            </div>
            <div class="form-group">
                <label for="ln">Last name</label>
                <input id="ln" name="ln" class="form-control" type="text">
            </div>
            <input type="submit" class="btn btn-block btn-primary">
        </form>
    </div>
</body>
</html>
