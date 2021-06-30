<%--
  Created by IntelliJ IDEA.
  User: 13486
  Date: 2021/6/30
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/show">
    书名<input name="book_name" value="${book.book_name}">
    內容<input name="content" value="${book.content}"> <input
        type="submit" value="搜索">
</form>
<table border="1" cellspacing="0">
    <tr>
        <td>id</td>
        <td>ISBN</td>
        <td>书名</td>
        <td>作者</td>
        <td>出版社</td>
        <td>出版时间</td>
        <td>内容</td>
    </tr>
    <c:forEach items="${pageInfo.list}" var="book">
        <tr>
            <td>${book.id}</td>
            <td>${book.ISBN}</td>
            <td>${book.book_name}</td>
            <td>${book.writer}</td>
            <td>${book.publish}</td>
            <td>${book.publish_time}</td>
            <td>${book.content}</td>
        </tr>
    </c:forEach></table>
<c:forEach begin="1" end="${pageInfo.pages}" var="i"> <c:if test="${pageInfo.pageNum==i}"> <a
        href="/show? pageSize=${i}&pageNumber=3&name=${hero.name}&type=${hero.type}"
        style="color: red">${i}</a>&nbsp&nbsp </c:if> <c:if test="${pageInfo.pageNum!=i}"> <a
        href="/show? pageSize=${i}&pageNumber=3&name=${hero.name}&type=${hero.type}">${i} </a>&nbsp&nbsp </c:if>
</c:forEach>

</body>
</html>
