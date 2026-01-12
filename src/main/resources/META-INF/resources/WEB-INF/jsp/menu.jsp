<c:forEach items="${foods}" var="f">
    <div class="card">
        <img src="${f.imageUrl}" width="150">
        <h3>${f.name}</h3>
        <p>₹${f.price}</p>
        <a href="/order/${f.name}/${f.price}">Order Now</a>
    </div>
</c:forEach>
