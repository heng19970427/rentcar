<%--
  Created by IntelliJ IDEA.
  User: Xiaoliu
  Date: 2018/7/20
  Time: 22:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(
            "yyyy-MM");
    java.util.Date currentTime = new java.util.Date();
    String time = simpleDateFormat.format(currentTime);
%>

<html>
<head>
    <title>经营月报表 - 租车管理系统</title>
    <jsp:include page="js_css.jsp"/>
    <style>
        .row {
            margin: 15px;
        }
    </style>
</head>
<body>
<jsp:include page="header.jsp"/>
<div class="container-fluid">
    <div class="row">
        <jsp:include page="sidebar.jsp"/>
        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4" id="mainWindow">
            <div class="d-flex justify-content-between flex-wrap flex-md-nowrap align-items-center pb-2 mb-3 border-bottom">
                <h1 class="h2">经营月报表</h1>
                <div class="btn-toolbar mb-2 mb-md-0">
                    <input type="text" value="<%=time%>" id="datetimepicker" class="btn btn-outline-dark">
                    <div class="btn-group mr-2">
                        <button class="btn btn-sm btn-outline-secondary">导出报表</button>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-md-5 text-center">
                    <h3>单车收入金额统计</h3>
                    <div id="balapie" style="width: 100%;height: 70%"></div>
                </div>
                <div class="col-md-5 text-center">
                    <h3>单车订单数量比例</h3>
                    <div id="balabar" style="width: 100%;height: 70%"></div>
                </div>
            </div>
        </main>
    </div>
</div>
<script type="text/javascript">
    $('#datetimepicker').datetimepicker({
        format: 'yyyy-mm',
        language: 'zh-CN',
        startView: 3,
        minView: 3,
        autoclose: true
    });
    // 基于准备好的dom，初始化echarts实例
    let myChart1 = echarts.init(document.getElementById('balapie'));
    let myChart2 = echarts.init(document.getElementById('balabar'));
    // 指定图表的配置项和数据
    let option1 = {
        series: [
            {
                name: '访问来源',
                type: 'pie',
                radius: '55%',
                data: [
                    {value: 355, name: '奥迪A80923'},
                    {value: 80, name: '奔驰'},
                    {value: 500, name: '宾利'},
                ]
            }
        ]
    };

    let option2 = {
        title: {
            text: '单车收入金额'
        },
        tooltip: {},
        legend: {
            data: ['收入']
        },
        xAxis: {
            data: ["奥迪A80923", "兰博基尼", "奔驰", "奥迪B80923", "宾利", "宝马"]
        },
        yAxis: {},
        series: [{
            name: '金额',
            type: 'bar',
            data: [1, 0, 1, 0, 1, 0]
        }]
    };
    // 使用刚指定的配置项和数据显示图表。
    myChart1.setOption(option1);
    myChart2.setOption(option2)
</script>
<jsp:include page="footer.jsp"/>
</body>
</html>
