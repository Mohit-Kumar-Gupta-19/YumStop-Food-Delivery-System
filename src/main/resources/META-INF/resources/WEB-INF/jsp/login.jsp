<%@ page language="java" contentType="text/html" %>

<html>
<head>
    <title>Login | YumStop</title>
    <link rel="stylesheet" href="/css/style.css">
</head>
<body>

<div class="container">
    <h2>🍔 YumStop Login</h2>

    <form action="/login" method="post">
        <input type="email" name="email" placeholder="Email" required>
        <input type="password" name="password" placeholder="Password" required>

        <button type="submit">Login</button>
    </form>

    <p>
        <a href="/register">Create Account</a> |
        <a href="/forgot">Forgot Password?</a>
    </p>
</div>

</body>
</html>
