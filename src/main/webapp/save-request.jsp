<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<h1>Enter your data pls </h1>

<form action="${pageContext.request.contextPath}/servlet" method="post">
    <input name="nameInput" placeholder="name"/>
    <input name="emailInput" placeholder="email"/>
    <button type="submit">Submit</button>
</form>
</body>
</html>