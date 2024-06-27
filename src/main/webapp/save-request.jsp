<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
</head>
<body>
<h1>Enter your data pls </h1>

<form action="${pageContext.request.contextPath}/" method="post">
    <input name="name" placeholder="name"/>
    <input name="email" placeholder="email"/>
    <button type="submit">Submit</button>
</form>
</body>
</html>