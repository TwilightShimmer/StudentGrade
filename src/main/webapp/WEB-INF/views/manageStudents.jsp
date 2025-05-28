<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>管理学生成绩</title>
</head>
<body>
<h1>管理学生成绩</h1>
<c:if test="${not empty grades}">
    <a href="${pageContext.request.contextPath}/grade/ranking/${grades[0].courseId}">查看排名</a>
    <table border="1">
        <thead>
        <tr>
            <th>学生ID</th>
            <th>课程ID</th>
            <th>成绩</th>
            <th>操作</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${grades}" var="grade">
            <tr>
                <td>${grade.studentId}</td>
                <td>${grade.courseId}</td>
                <td>${grade.score}</td>
                <td>
                    <form action="${pageContext.request.contextPath}/admin/editGrade/${grade.gradeId}" method="get" style="display: inline;">
                        <button type="submit">编辑</button>
                    </form>
                    <form action="${pageContext.request.contextPath}/admin/deleteGrade/${grade.gradeId}" method="post" onsubmit="return confirmDelete()">
                        <input type="hidden" name="teacherId" value="${teacherId}">
                        <button type="submit">删除</button>
                    </form>
                </td>
            </tr>

        </c:forEach>
        </tbody>
    </table>
    <a href="${pageContext.request.contextPath}/grade/statistics/${teacherId}">查看统计</a>
</c:if>
<c:if test="${empty grades}">
    <p>没有学生成绩信息。</p>
</c:if>
<a href="${pageContext.request.contextPath}/admin/addGrade/${teacherId}">新增学生成绩</a>
</body>
</html>
<script>
    function confirmDelete() {
        return confirm('确定要删除这条成绩记录吗？此操作不可恢复！');
    }
</script>