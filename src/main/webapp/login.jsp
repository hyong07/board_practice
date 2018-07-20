<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		<c:when test="${loginId != null}">
			<table border=1>
				<tr>
					<th colspan=5><%=session.getAttribute("loginId") + " 님 환영합니다."%></th>
				</tr>
				<tr>
					<td><button id="logout">로그아웃</button></td>
					<td><button id="mypage">나의페이지</button></td>
					<td><button id="memberout">회원탈퇴</button></td>
					<td><button id="modify">정보수정</button></td>
					<td><button id="toBoard">게시판으로 가기</button></td>
				</tr>
			</table>

			<script>
				document.getElementById("logout").onclick = function() {
					location.href = "logout.mem";
				}

				document.getElementById("mypage").onclick = function() {
					location.href = "mypage.mem";
				}

				document.getElementById("memberout").onclick = function() {
					var result = confirm("정말로 탈퇴 하시겠습니까?");
					if (result) {
						location.href = "memberout.mem";
					}
				}
				document.getElementById("modify").onclick = function() {

					location.href = "modify.mem";
				}
				document.getElementById("toBoard").onclick = function() {
					location.href = "board.bo";
				}
			</script>

		</c:when>
		<c:otherwise>
			<form action="login.mem" method="post">
				<table border=1>
					<tr>
						<th colspan="2">회원로그인</th>
					</tr>
					<tr>
						<td>아이디:</td>
						<td><input type="text" name="id"></td>
					</tr>
					<tr>
						<td>비밀번호:</td>
						<td><input type="password" name="pw"></td>
					</tr>
					<tr>
						<th colspan="2">
							<button id="loginbt" type="submit">로그인</button>
							<button id="joinbt" type="button">회원가입</button>
						</th>
					</tr>
				</table>
			</form>			
			<script>
				document.getElementById("joinbt").onclick = function() {
					location.href = "join.mem";
				}
				</script>
		</c:otherwise>
	</c:choose>
</body>
</html>