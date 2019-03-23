<%--
  Created by IntelliJ IDEA.
  User: wy
  Date: 2019-03-23
  Time: 19:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
    </tr>
    <c:forEach var="row" items="${data}">
        <tr>
            <td>${row.id}</td>
            <td>${row.name}</td>
        </tr>
    </c:forEach>
    </table>
</body>
</html>
