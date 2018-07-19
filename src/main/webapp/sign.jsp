<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="member.mem" method=post>
      <table border=2>
         <tr>
            <th colspan="2">회원 가입 정보</th>
         </tr>
         <tr>
            <td class="right">아이디:</td>
            <td><input id="id1" type="text" name="id">
              
         </tr>
         <tr>
            <td class="right">비밀번호:</td>
            <td><input id="pw" type="password" name="pw"></td>
         </tr>
  
         <tr>
            <td id="name" class="right">이름:</td>
            <td><input id="nametext" type="text" name="name"></td>
         </tr>
         <!-- <tr>
            <td class="right">전화번호:</td>
            <td><select name="phone1" id="">
                  <option value="02" >02</option>
                  <option value="032">032</option>
                  <option value="010">010</option>
            </select>- <input id="phone1" type="text" name="phone2" style="width: 50px;" maxlength="4">-
               <input id="phone2" type="text" name="phone3" style="width: 50px;" maxlength="4">
            </td>
         </tr> -->
<!--          <tr> -->
<!--             <td class="right">이메일:</td> -->
<!--             <td><input type="email" name="email"></td> -->
<!--          </tr> -->
         <!-- <tr>
            <td class="right">우편번호:</td>
            <td><input type="text" id="sample6_postcode" placeholder="우편번호" name="zipcode"
               readonly> <input type="button"
               onclick="sample6_execDaumPostcode()" value="우편번호 찾기"></td>

         </tr>
         <tr>
            <td class="right">주소1:</td>
            <td><input type="text" id="sample6_address" name="address1" placeholder="주소"></td>
         </tr>
         <tr>
            <td class="right">주소2:</td>
            <td><input type="text" id="sample6_address2" name="address2" placeholder="상세주소"></td>
         </tr> -->
         <tr>
            <th colspan="2">
               <button id="joinbt" type="submit">회원가입</button>
               <button id="resetbt">다시입력</button>
            </th>
         </tr>
      </table>
   </form>
</body>
</html>