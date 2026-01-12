<h2>Your Orders</h2>
<c:forEach items="${orders}" var="o">
    <p>${o.foodName} - ₹${o.price} - ${o.status}</p>
</c:forEach>
