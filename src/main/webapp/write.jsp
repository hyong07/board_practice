<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
	div{
		box-sizing: border-box;
		
	}
	
	#wrapper{
		width:300px;
		margin:0px auto;
	}
	
	#div-writer input{
		text-align:center;
		box-sizing:border-box;
		width:100%;
	}
	
	#div-contents textarea{
		text-align:center;
		width:100%;
		box-sizing:border-box;
		resize:none;
	}
	
	#div-button{
		text-align:center;
	}
	
	
</style>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<script>
	$(document).ready(function(){
		$("#back").click(function(){
			$(location).attr("href","board.bo");
		})
	})
</script>
</head>
<body>
	<form action="boardWrite.bo" method="post">
	<div id="wrapper">
		<div id="div-input">
			<input type="hidden" value="${sessionScope.loginId}" name="writer">			
			<div id="div-writer"><input type="text" placeholder="Input Title" name="title"></div>
			<div id="div-contents"><textarea name="contents" placeholder="Input Contents"></textarea></div>
		</div>
		<div id="div-button">
			<button id="send">±€ ¿€º∫</button>
			<button type="button" id="back">Back</button>
		</div>
	</div>
	</form>
</body>
</html>