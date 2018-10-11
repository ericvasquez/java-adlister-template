<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>${param.title}</title>

<c:if test="${param.role == 'admin'}">
    <link rel="stylesheet" href="static/css/admin.css">
</c:if>
<c:if test="${param.role != 'admin'}">
    <link rel="stylesheet" href="static/css/custom.css">
</c:if>