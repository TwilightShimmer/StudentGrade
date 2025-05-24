<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成绩统计</title>
    <script src="${pageContext.request.contextPath}/resources/js/echarts.min.js"></script>
    <script src="${pageContext.request.contextPath}/resources/js/gradeStatistics.js"></script>
    <script>
        const distributionData = [
            <c:forEach var="item" items="${distribution}">
            {score: ${item.score}, count: ${item.count}},
            </c:forEach>
        ];
        window.onload = function() {
            initGradeStatistics(distributionData);
        };
    </script>
</head>
<body>
<div style="display: flex;">
    <div style="width: 50%;">
        <h3>基本统计</h3>
        <p>平均分: ${statistics.avgScore}</p>
        <p>最高分: ${statistics.maxScore}</p>
        <p>最低分: ${statistics.minScore}</p>
    </div>
    <div id="chart" style="width: 50%; height: 400px;"></div>
</div>
</body>
</html>
