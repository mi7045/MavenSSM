<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2018-07-26
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript" src="${base}/js/jquery-1.8.2.min.js"></script>
<script>
    checkAll = function (obj) {
        var arrayIds = document.all.userId;
        if (arrayIds.length) {
            for (i = 0; i < arrayIds.length; i++) {
                arrayIds[i].checked = obj.checked;
            }
        }
        else {
            arrayIds.checked = obj.checked;
        }
    }
</script>
<body>
<table border="1" cellspacing="0" cellpadding="" align="center">
    <tr class="list_tit2">
        <td align="center">
            <input type="checkbox" name="userId" id="userId" onclick='checkAll(this)'/>
        </td>
        <td align="center">
            <p>用户ID</p>
        </td>
        <td align="center">
            <p>用户姓名</p>
        </td>
        <td align="center">
            <p>用户邮箱</p>
        </td>
        <td align="center">
            <p>用户身份</p>
        </td>
        <td align="center">
            <p>用户状态</p>
        </td>
        <td align="center">
            <p>注册时间</p>
        </td>
        <td align="center">
            <p>注册IP</p>
        </td>
    </tr>
    <c:if test="${not empty userList}">
        <c:forEach items="${userList}" var="user" varStatus="vs">
            <tr class="list_tit2">
                <td align="center">
                    <input type="checkbox" id="userId" value="${user.id}"/>
                </td>
                <td align="center">
                    <p>${user.id}</p>
                </td>
                <td align="center">
                    <p>${user.username}</p>
                </td>
                <td align="center">
                    <p>${user.email}</p>
                </td>
                <td align="center">
                    <p>${user.role}</p>
                </td>
                <td align="center">
                    <p>${user.status}</p>
                </td>
                <td align="center">
                    <p><fmt:formatDate value="${user.regTime}" pattern="yyyy-MM-dd HH:mm:ss"/></p>
                </td>
                <td align="center">
                    <p>${user.regIp}</p>
                </td>
            </tr>
        </c:forEach>
    </c:if>

</table>
</body>
</html>
