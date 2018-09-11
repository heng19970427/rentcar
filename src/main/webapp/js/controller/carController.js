 //控制层 
app.controller('carController' ,function($scope,$controller ,carService,uploadService){
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		carService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}    
	
	//分页
	$scope.findPage=function(page,rows){			
		carService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		carService.findOne(id).success(
			function(response){
				$scope.entity= response;					
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象
			$scope.entity.car.desc=editor.html();
			serviceObject=carService.add( $scope.entity  );//增加
		serviceObject.success(
			function(response){
				if(response.success){
                    // //重新查询
		        	// $scope.reloadList();//重新加载
					alert("添加成功!");
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		carService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象
	
	//搜索
	$scope.search=function(page,rows){
		carService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}
		);
	}

    $scope.entity={caroptionList:[],imageList:[]};
	$scope.entity.caroptionList=[];

    $scope.addTableRow=function () {
        $scope.entity.caroptionList.push({});
    }

    $scope.deleteTableRow=function (index) {
        $scope.entity.caroptionList.splice(index,1);//删除
    }

    /**
     * 上传图片
     */
    $scope.image_entity={path:""};
    $scope.uploadFile=function(){
        uploadService.uploadFile().success(function(response) {
            if(response.success){//如果上传成功，取出url
                $scope.image_entity.path=response.message;//设置文件地址
            }else{
                alert(response.message);
            }
        }).error(function() {
            alert("上传发生错误");
        });
    };

    $scope.add_image_entity=function(){
        $scope.entity.imageList.push($scope.image_entity);
    }

    //列表中移除图片
    $scope.remove_image_entity=function(index){
        $scope.entity.imageList.splice(index,1);
    }


});	
