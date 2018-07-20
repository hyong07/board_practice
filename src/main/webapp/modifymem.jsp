<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
table {
	margin: auto;
}
</style>
</head>
<body>

	<c:choose>
		<c:when test="${modresult > 0}">
			<script>
				alert("수정되었습니다");
				location.href="main.mem";
			</script>
		</c:when>
	</c:choose>




	<script>
		window.onload = function() {
			document.getElementById("back").onclick = function() {

				location.href = "login.jsp";

			}
		}
	</script>

	<form action="modifyinfo.mem" method="post">
		<table border=1>
			<tr>
				<th colspan=2>마이페이지</th>
			</tr>

			<tr>
				<th>아이디 :</th>
				<td><input type="text" name=id id="id" size=20; readonly
					value="${myinfo.id}"></td>
			</tr>

			<tr>
				<th>비밀번호 :</th>
				<td><input type="text" name=pw id="pw" size=20;></td>
			</tr>

			<tr>
				<th>이름 :</th>
				<td><input type="text" name=name id="name" size=20;
					value="${myinfo.name}"></td>
			</tr>


			<tr>
				<th colspan=2>
					<button id="modify">수정하기</button>
					<button type=button id="back">확인</button>


				</th>
			</tr>


		</table>
	</form>

</body>
</html>