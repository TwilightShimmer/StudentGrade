<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>成绩分析</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/admin.css">
    <!-- 引入 ECharts -->
    <script src="${pageContext.request.contextPath}/js/echarts.min.js"></script>
</head>
<body>

<div class="container">
    <h2>学生成绩分析</h2>

    <p><strong>总成绩：</strong>${totalScore}</p>
    <p><strong>班级排名：</strong>${rank}</p>

    <div id="pieChart" style="width: 600px;height:400px;"></div>

    <br/>
    <a href="#" onclick="window.history.back()" class="btn">返回</a>
</div>

<script type="text/javascript">
    var chartDom = document.getElementById('pieChart');
    var myChart = echarts.init(chartDom);

    var courseData = [
        <c:forEach items="${subjectScores}" var="item">
        {value: ${item.score}, name: '${item.course_name}'},
        </c:forEach>
    ];

    var option = {
        title: {
            text: '各科成绩占比',
            left: 'center'
        },
        tooltip: {
            trigger: 'item'
        },
        legend: {
            orient: 'vertical',
            left: 'left'
        },
        series: [{
            name: '成绩分布',
            type: 'pie',
            radius: '50%',
            data: courseData,
            emphasis: {
                itemStyle: {
                    shadowBlur: 10,
                    shadowOffsetX: 0,
                    shadowColor: 'rgba(0, 0, 0, 0.5)'
                }
            }
        }]
    };

    option && myChart.setOption(option);
</script>

</body>
</html>