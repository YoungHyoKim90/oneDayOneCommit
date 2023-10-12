<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<!-- !DOCTYPE html : 선언된 페이지의 HTML 버전이 무엇인지를 웹 브라우저에 알려주는 역할-->
<html>
<head>
<!-- 	head 태그는 브라우저상에서 보여지진 않지만,
 		head는 <title> 같은 페이지나, CSS의 링크(HTML 컨텐츠를 CSS로 스타일링하기를 원한다면), 파비콘(favicon), 
 		그리고 다른 메타데이터(작성자, 중요한 키워드와 같은 HTML에 대한 내용)를 포함합니다.  -->
<meta charset="UTF-8">
<title>JSP Code Review</title> <!-- title : 해당 페이지의 제목을 나타내는 태그 탭의 이름 등을 결정한다. -->
</head>
<body>

	<div class="testOne" id="TestDivone"> <!-- div 태그는 수직 레이아웃을 담당. -->
	
		<!-- 입력 필드로 이 div를 그룹화합니다 -->
		<!-- name 속성의 경우 책갈피의 역활을 하였으나 HTML5에서는 폐기 된 속성이다. -->
		<input type="text" id="testInputIdOne" name="testInputNameOne"> <!-- input tag는 사용자에게 입력을 받거나, 서버로 입력을 받을 값을 저장하는 태그 -->
		<input type="hidden" id="testInputIdTwo" name="testInputNameTwo">
		<input type="hidden" id="testInputIdThree" name="testInputNameThree"> 

	</div> 
	
	<!-- 하이퍼링크 -->
	<a class="aTagClass" onclick="eventItemDetail.aTagClassOnclick();" title="<fmt:message bundle='${messages}' key='add.key' />">
		<!-- 메시지 번들에서 텍스트를 가져와서 표시합니다 -->
		<fmt:message bundle='${messages}' key='add.key'/>
	</a>

</body>
</html>
