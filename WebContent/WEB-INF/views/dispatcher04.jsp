<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h4>DispatcherServlet04 Response</h4>
		<!-- 아래와 같이 Java의 규칙과 태그를 혼합할 수 있다. -->
		<!-- JSP 형태이기에 가능한 것이다. -->
		<!-- 처음 실행될 때,Text형태로 작성한 이후 .java로 바뀐이후
		컴파일 하여 .class이 된 후 객체를 생성한다. -->
		<!-- 객체 생성이후 service를 실행함으로서 html로 만들어 적용한다. -->
		<%for(int i = 0 ; i < 10 ; i++){ %>
			<p>dispatcher04.jsp Running</p>
		<%} %>
		Response Contents
	</body>
</html>