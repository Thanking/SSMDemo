<%--
  Created by IntelliJ IDEA.
  User: 亚亚
  Date: 2021/6/28
  Time: 0:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>查询所有的账户</h2>
<table>
    <tr><c:forEach items="${book}" var="book">
        <td>${book.bookId}</td>
        <td>${book.bookName}</td>
        <td>${book.bookCounts}</td>
        <td>${book.detail}</td>
    </c:forEach>
    </tr>
</table>



</body>
</html>
