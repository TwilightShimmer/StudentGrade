function initGradeStatistics(distribution) {
    const chartDom = document.getElementById('chart');
    const myChart = echarts.init(chartDom);

    // 将成绩按10分一段分组
    const scoreRanges = {};
    distribution.forEach(item => {
        const score = item.score;  // 从传的入distribution对象中获取score
        const range = Math.floor(score / 10) * 10;
        scoreRanges[range] = (scoreRanges[range] || 0) + item.count;
    });

    // 转换为柱状图所需的数据格式
    const xAxisData = [];
    const yAxisData = [];
    for (let range = 0; range <= 90; range += 10) {
        xAxisData.push(`${range}-${range + 9}分`);
        yAxisData.push(scoreRanges[range] || 0);
    }

    const option = {
        title: {
            text: '成绩分布'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'
            }
        },
        xAxis: {
            type: 'category',
            data: xAxisData,
            axisLabel: {
                rotate: 45
            }
        },
        yAxis: {
            type: 'value',
            name: '人数'
        },
        series: [{
            name: '人数',
            type: 'bar',
            data: yAxisData,
            itemStyle: {
                color: '#5470C6'
            }
        }]
    };
    myChart.setOption(option);
}