<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Admin Dashboard - YumStop</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<h1>👑 Admin Dashboard</h1>

<a href="/dashboard">User Dashboard</a> |
<a href="/logout">Logout</a>

<hr>

<h2>👤 Registered Users</h2>

<table border="1" cellpadding="10">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Email</th>
    </tr>

    <c:forEach items="${users}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.name}</td>
            <td>${u.email}</td>
        </tr>
    </c:forEach>
</table>

<hr>

<h2>🧾 All Orders</h2>

<table border="1" cellpadding="10">
    <tr>
        <th>Order ID</th>
        <th>User</th>
        <th>Food</th>
        <th>Price</th>
        <th>Status</th>
    </tr>

    <c:forEach items="${orders}" var="o">
        <tr>
            <td>${o.id}</td>
            <td>${o.user.name}</td>
            <td>${o.foodName}</td>
            <td>₹${o.price}</td>
            <td>${o.status}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
