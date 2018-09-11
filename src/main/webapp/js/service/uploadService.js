//文件上传服务层
app.service("uploadService",function($http){
    this.uploadFile=function(){
        var formData=new FormData();
        //文件表单的id集合，取第一个
        formData.append("file",file.files[0]);
        return $http({
            method:'POST',
            url:"../image/uploadImage",
            data: formData,
            headers: {'Content-Type':undefined},
            transformRequest: angular.identity
        });
    }
});
