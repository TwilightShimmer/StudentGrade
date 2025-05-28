<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>成绩统计</title>--%>
<%--    <script src="${pageContext.request.contextPath}/resources/js/echarts.min.js"></script>--%>
<%--    <script src="${pageContext.request.contextPath}/resources/js/gradeStatistics.js"></script>--%>
<%--    <script>--%>
<%--        const distributionData = [--%>
<%--            <c:forEach var="item" items="${distribution}">--%>
<%--            {score: ${item.score}, count: ${item.count}},--%>
<%--            </c:forEach>--%>
<%--        ];--%>
<%--        window.onload = function() {--%>
<%--            initGradeStatistics(distributionData);--%>
<%--        };--%>
<%--    </script>--%>
<%--</head>--%>
<%--<body>--%>
<%--<div style="display: flex;">--%>
<%--    <div style="width: 50%;">--%>
<%--        <h3>基本统计</h3>--%>
<%--        <p>平均分: ${statistics.avgScore}</p>--%>
<%--        <p>最高分: ${statistics.maxScore}</p>--%>
<%--        <p>最低分: ${statistics.minScore}</p>--%>
<%--    </div>--%>
<%--    <div id="chart" style="width: 50%; height: 400px;"></div>--%>
<%--</div>--%>
<%--</body>--%>
<%--</html>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>成绩统计</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
</head>
<body>

<div class="container">
    <h2>课程成绩统计信息</h2>

    <h3>基础统计</h3>
    <ul>
        <li>平均分：<strong><fmt:formatNumber value="${statistics.avgScore}" pattern="#0.00"/></strong></li>
        <li>最高分：<strong>${statistics.maxScore}</strong></li>
        <li>最低分：<strong>${statistics.minScore}</strong></li>
    </ul>

    <h3>分数分布</h3>
    <table class="data-table">
        <thead>
        <tr>
            <th>分数</th>
            <th>人数</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${distribution}" var="item">
            <tr>
                <td>${item.score}</td>
                <td>${item.count}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>

    <br/>
    <a href="#" onclick="window.history.back()">返回</a>
</div>

</body>
</html>