<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery.js"></script>
<title>Insert title here</title>
</head>
<body>
	帐号：
	<input type="text" name="userName" id="userName"/>
	<input type="button"  id="btn1" value="提交"/>
	<hr/>
	编号：
	<input type="text" name="userId" id="userId"/>
	<input type="button"  id="btn2" value="查询"/>
	<hr/>
</body>
<script type="text/javascript">
	$('#btn1').click(function(){
		var userName =$('#userName').val();
		if(userName == ''){
			alert('请填写帐号');
		}else{
			$.post("ajaxUser.do",{userName:userName},function(data){
				alert(data);
			});			
		}
	});
	
	$('#btn2').click(function(){
		var userId =$('#userId').val();
		$.post("ajaxUser2.do",{userId:userId},function(data){
			alert(data.userId+'----'+data.userName);
		});			
	});
</script>
</html>