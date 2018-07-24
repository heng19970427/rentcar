<!DOCTYPE html>
<html lang="en">
<head>
    <title>租车管理系统</title>
    <jsp:include page="../js_css.jsp"/>
</head>
<body>
   <jsp:include page="header.jsp"/>
<div class="container-fluid">
    <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
            <ul class="nav nav-sidebar">
                <li><a href="../index.html" role="tab">订单信息</a></li>
                <li class="active"><a href="#" role="tab">商家信息</a></li>
                <li><a href="../car/carManager.html" role="tab">车辆管理</a></li>
            </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
            <div class="row">
                <form class=" col-md-8 form-inline">
                    <div class="input-group">
                        <span class="input-group-addon">商家搜索:</span>
                        <input type="text" class="form-control" placeholder="Username">
                    </div>
                </form>

                <div class="col-md-4">
                    <button type="button" class="btn btn-primary">添加用户</button>
                </div>
            </div>
            <hr/>
            <div>
                <table class="table table-hover" style="text-align: center">
                    <tr>
                        <td>ID</td>
                        <td>姓名</td>
                        <td>地址</td>
                        <td>当前出租车辆</td>
                        <td colspan="2">操作</td>
                    </tr>
                    <tr>
                        <td>0071</td>
                        <td>张先生</td>
                        <td>井冈山大道32号店铺</td>
                        <td>5</td>
                        <td><button type="button" class="btn btn-info">详情</button></td>
                        <td><button type="button" class="btn btn-danger">删除</button></td>
                    </tr>
                    <tr>
                        <td>0071</td>
                        <td>张先生</td>
                        <td>井冈山大道32号店铺</td>
                        <td>5</td>
                        <td><button type="button" class="btn btn-info">详情</button></td>
                        <td><button type="button" class="btn btn-danger">删除</button></td>
                    </tr>
                    <tr>
                        <td>0071</td>
                        <td>张先生</td>
                        <td>井冈山大道32号店铺</td>
                        <td>5</td>
                        <td><button type="button" class="btn btn-info">详情</button></td>
                        <td><button type="button" class="btn btn-danger">删除</button></td>
                    </tr>
                    <tr>
                        <td>0071</td>
                        <td>张先生</td>
                        <td>井冈山大道32号店铺</td>
                        <td>5</td>
                        <td><button type="button" class="btn btn-info">详情</button></td>
                        <td><button type="button" class="btn btn-danger">删除</button></td>
                    </tr>
                </table>
            </div>

        </div>
    </div>
</div>

<script>window.jQuery || document.write('<script src="../js/jquery.min.js"><\/script>')</script>
<script src="../js/bootstrap.min.js"></script>
<!-- Just to make our placeholder images work. Don't actually copy the next line! -->
<script src="../js/holder.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="../js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>
