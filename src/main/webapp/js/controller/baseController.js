app.controller('baseController' ,function($scope){
    $scope.selectedIds=[]; //被选中Id的数组

    $scope.updateSelection=function ($event,id) {
        //判断是否被选中
        if($event.target.checked){
            //更新列表
            $scope.selectedIds.push(id);
        }
        else{
            //查找索引
            var idx = $scope.selectedIds.indexOf(id);
            $scope.selectedIds.splice(idx,1);//删除
        }
    }

    //分页控件配置 perPageOptions每页显示的条数的选择 totalItems是总记录数 itemsPerPage每页显示数
    $scope.paginationConf = {
        currentPage: 1,
        totalItems: 10,
        itemsPerPage: 10,
        perPageOptions: [10, 20, 30, 40, 50],
        onChange: function(){
            $scope.reloadList();//重新加载
        }
    };

    //重新加载列表 数据
    $scope.reloadList=function(){
        //切换页码
        $scope.search($scope.paginationConf.currentPage,$scope.paginationConf.itemsPerPage);
    }
    
    //将JSON字符串转换为 拼接字符串
    $scope.jsonToString=function (jsonString,key) {
        var value="";
        //转换为对象
        var json = JSON.parse(jsonString);
        for(i=0;i<json.length;i++){
            if(i>0){
                value+=",";
            }
            value+=json[i][key];
        }
        return value;
    }
});

