
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="company.web.dto.Counter"%>
<%@ page import="java.util.*"%>
<%-- 위와 같이 클래스와 라이브러리를 import한다. --%>    
 
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		
		<%Counter applicationCounter = (Counter)application.getAttribute("applicationCounter"); %>		
		ApplicationCounter : <%=applicationCounter.getValue() %>
		<br>
		<%Counter sessionCounter = (Counter)session.getAttribute("sessionCounter"); %>
		SessionCounter : <%=sessionCounter.getValue() %>
		<br>
		<%Counter requestCounter = (Counter)request.getAttribute("requestCounter"); %>
		RequestCounter :  <%=requestCounter.getValue() %>
		<br>
		<br>
		<%-- application, session, request은 내장 변수 --%>
		
		Expression Language
		ApplicationCounter : ${applicationCounter.value} <br>
		SessionCounter : ${sessionCounter.value} <br>
		RequestCounter : ${requestCounter.value} <br>
		<%-- Key값 requestCounter의 getValue() 메소드를 실행시킨 결과를 가져온다.--%>
		<%-- .value는 Counter클래스의 속성값 value이다. 하지만 private으로 선언되었기때문에 --%>
		<%-- Java에서는 저러한 형태로서는 가져올 수 없지만 여기서 .value는 .getValue()를 실행시키도록 되어있다. --%>
		<%-- 즉 getter를 만들어야 값을 가져올 수 있다. --%>
		<%-- 먼저 request범위 Key -> session범위 Key -> application범위 Key -> NULL(오류발생 X) --%>
		<%-- 즉 동일한 Key값을 가지더라도 우선순위의 것을 가져온다. --%>
		
		
	</body>
</html>