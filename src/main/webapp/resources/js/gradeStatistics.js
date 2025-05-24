function initGradeStatistics(distribution) {
    const chartDom = document.getElementById('chart');
    const myChart = echarts.init(chartDom);

    // ���ɼ���10��һ�η���
    const scoreRanges = {};
    distribution.forEach(item => {
        const score = item.score;  // �Ӵ�����distribution�����л�ȡscore
        const range = Math.floor(score / 10) * 10;
        scoreRanges[range] = (scoreRanges[range] || 0) + item.count;
    });

    // ת��Ϊ��״ͼ��������ݸ�ʽ
    const xAxisData = [];
    const yAxisData = [];
    for (let range = 0; range <= 90; range += 10) {
        xAxisData.push(`${range}-${range + 9}��`);
        yAxisData.push(scoreRanges[range] || 0);
    }

    const option = {
        title: {
            text: '�ɼ��ֲ�'
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
            name: '����'
        },
        series: [{
            name: '����',
            type: 'bar',
            data: yAxisData,
            itemStyle: {
                color: '#5470C6'
            }
        }]
    };
    myChart.setOption(option);
}