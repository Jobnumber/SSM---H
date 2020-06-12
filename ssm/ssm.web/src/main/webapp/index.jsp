<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="user/findAll">测试查询</a>
<h1>测试保存</h1>
<form action="user/save" method="post">
    名称：<input type="text" name="name"/><br/>
    年龄：<input type="text" name="age"><br/>
    <input type="submit" value="保存"/>
</form>
</body>
</html>
