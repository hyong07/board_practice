<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
#content {
   width: 700px;
   height: 400px;
   text-align: center;
}

#title {
   width: 500px;
}

.atitle:hover {
   text-decoration: underline;
}

.navi {
   text-decoration: none;
   color: black;
}

.navi:hover {
   text-decoration: underline;
}
</style>
</head>
<body>
   
   <div>
      <table border="1">
         <tr>
            <th colspan="5">자유게시판</th>
         </tr>
         <tr>
            <th>글번호</th>
            <th id="title">제목</th>
            <th>작성자</th>
            <th>작성일</th>
            <th>조회수</th>
         </tr>


         <c:choose>
         
         <c:when test="${result.size() != 0}">
         <c:forEach var="tmp" items="${result}">
         <tr>
            <td>${tmp.seq}</td>
            <td class="atitle"><a
               href="BoardView.bo?seq=${tmp.seq}&count=${tmp.viewcount}"
               style="text-decoration: none; color: black;">${tmp.title}</a></td>
            <td>${tmp.writer}</td>
            <td>${tmp.writedate}</td>
            <td>${tmp.viewcount}</td>
         </tr>
         </c:forEach>
         
         </c:when>
         <c:otherwise>
         <tr>
            <td colspan=5>표시할 내용이 없습니다.</td>
         </tr>
         </c:otherwise>
   
         </c:choose>
         
<!--          <tr> -->
<%--             <td colspan="5" style="text-align: center;">${navi}</td> --%>
<!--          </tr> -->

         <tr>
            <td colspan="5" style="text-align: right;">
               <button id="writebtn">글쓰기</button>
               <button id="backbtn">돌아가기</button>
            </td>
         </tr>

      </table>
   </div>
   <script>
      document.getElementById("writebtn").onclick = function() {
         location.href = "write.bo";
      }
      document.getElementById("backbtn").onclick = function() {
         location.href = "login.jsp";
      }
      
      document.getElementById("${page}").style.fontWeight = "bold";
      document.getElementById("${page}").removeAttribute("href");
   </script>


</body>
</html>