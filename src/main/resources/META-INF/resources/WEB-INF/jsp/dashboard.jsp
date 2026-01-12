<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Dashboard | YumStop</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<div class="navbar">
    <h3>🍽 YumStop</h3>
    <a href="/menu">Menu</a>
    <a href="/orders">My Orders</a>
    <a href="/feedback">Feedback</a>
    <a href="/contact">Contact</a>
    <a href="/logout">Logout</a>
</div>

<div class="container">
    <h2>Welcome, ${sessionScope.user.name} 👋</h2>

    <img src="/images/food-banner.jpg" class="banner">

    <c:if test="${sessionScope.user.email == 'admin@yumstop.com'}">
        <br><br>
        <a class="admin-btn" href="/admin/dashboard">👑 Admin Dashboard</a>
    </c:if>
</div>

</body>
</html>
