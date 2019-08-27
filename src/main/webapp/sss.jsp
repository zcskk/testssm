<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="js/jquery.js"></script>
<title>Insert title here</title>
</head>
<body>
<script >
function openfile(){
	$("[name=file]")[0].click();
}
function upload(){
	var formData = new FormData();
    formData.append("file",$("[name=file]")[0].files[0]);
    $.ajax({
        url:"sss.action",
        type:'post',
        data: formData,
        contentType: false,
        processData: false,
        success:function(res){
           $(".upimg").attr("src",res);
        }
    });

}
</script>
<button onclick="openfile();">
测试
</button>
<button onclick="upload();">
上传
</button>
<div>
<img class="upimg" >
</div>

<form method="post" action="sss.action" enctype="multipart/form-data" style="display:none;">
<input type="file" name="file"> 
</form>
</form>
</body>
</html>