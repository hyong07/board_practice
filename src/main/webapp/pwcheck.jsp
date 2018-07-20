<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script>
	$(document).ready(function() {
		$("#back").click(function() {
			$(location).attr("href", "main.mem");
		})
	})
</script>
</head>
<body>

	<c:choose>
		<c:when test="${outresult}">
			<script>
				alert("탈퇴되었습니다");
				location.href="main.mem";
			</script>
		</c:when>
	</c:choose>

	<form action="pwcheck.mem" method=post>
		<div>
			<div>비밀번호 확인</div>
			<div>
				<input type=text name=pw>
			</div>
			<div>
				<button>탈퇴하기</button>
				<button type=button id=back>돌아가기</button>
			</div>
		</div>
	</form>
</body>
</html>