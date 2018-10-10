<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav>
    This is My Navbar and it's awesome
</nav>

<h2>${param.role}</h2>

<c:if test="${param.role != 'admin'}">
    <h1>Welcome To The Site!</h1>
</c:if>

<c:if test="${param.role == 'admin'}">
    <h1>Welcome To The Admin dashboard!</h1>
</c:if>