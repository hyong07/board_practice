<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	<style>
			
			table{
				margin: auto;
			}
			
		
		</style>
</head>
<body>

	
	
	<script>
	window.onload = function() {
		document.getElementById("back").onclick = function(){
		
		location.href="login.jsp";
		
		
		}
	}
	
	</script>


<table border=1>
        <tr>
            <th colspan=2>마이페이지</th>
        </tr>
		<c:choose>

		<c:when test="${result != null}">
		
			<c:forEach var="item" items="${result}">
        <tr>
            <th>아이디 :</th>
            <td>
                <input type="text" name=id id="id" size=20; readonly value="${item.id}">
 
            </td>
        </tr>

        <tr>
            <th>이름 :</th>
            <td>
                <input type="text" name=name id="name" size=20; readonly value="${item.name}">

            </td>
        </tr>

        </c:forEach>
	</c:when>
	
	<c:otherwise>
	정보없음
	</c:otherwise>
	
	</c:choose>
	
	 <tr>
            <th colspan=2>
           
                <button id="back">확인</button>
                

            </th>
        </tr>
	
	
    </table>


</body>
</html>