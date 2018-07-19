
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

      <style>
         #contents{
            width: 100%;
              height: 200px;
         }
         
         table{
            margin: auto;
         }
         
         #comment_text{
            width: 100%;
            height: 30px; 
         }
      
      </style>
      
         <script>
      
      
        
         </script>
   </head>
<body>

   

   <table border=1>
      
      <th colspan=4 align=center> 내가쓴글 </th>
      
      <tr>
         <td>제목</td>
         <td><input type="text" name=title id="title" size=20; readonly value="${result.title}"></td>
         <td>작성자</td>
         <td><input type="text" name=name id="name" size=32; readonly value="${result.writer}"></td>
      </tr>
      
      <tr>
         <td>작성일</td>
         <td><input type="text" name=writedate id="writedate" size=20; readonly value="${result.write_date}"></td>
      </tr>
      
      <tr>
      <td>첨부파일</td>
      <td>첨부파일 들어가는곳
         
         <a href="Download?fileName="></a>
      
      </td>
      </tr>
      
<!--       if(dto.getWriter().equals(session.getAttribute("loginId"))) -->
      
      
      <tr>
         <td colspan=4><textarea name=contents id="contents" readonly >${result.contents}</textarea></td>
      </tr>   

      <tr>
         <td colspan=4 align=right> 
         
         <button  name=modify id="modify" type="button">수정하기</button>
         <button  name=delete id="delete" type="button">삭제하기</button>
         <button id="back" type="button">목록으로</button></td>
   
      </tr>

   </table>



</body>
</html>