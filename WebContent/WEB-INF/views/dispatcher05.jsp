<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h4>DispatcherServlet05 Response</h4>
		<!-- 아래와 같이 Java의 규칙과 태그를 혼합할 수 있다. -->
		<!-- JSP 형태이기에 가능한 것이다. -->
		<!-- 처음 실행될 때,Text형태로 작성한 이후 .java로 바뀐이후
		컴파일 하여 .class이 된 후 객체를 생성한다. -->
		<!-- 객체 생성이후 service를 실행함으로서 html로 만들어 적용한다. -->
		<%for(int i = 0 ; i < 10 ; i++){ %>
			<p>dispatcher05.jsp Running</p>
			<p>Get Value by Parameter</p>			
		<%} %>
		
		<!-- <h4>How01 html 주석  그렇기에 클라이언트로 빠진다.
		  		그렇기에 전달은 되지만 렌더링은 되지 않는다. </h4> -->
		<%-- How01 jsp  주석  하지만 이것은 클라이언트에 포함되지 않는다.
				이것은 네트워크로도 빠지지 않기때문에 이를 ㅡ추천한다. --%>
		<%--
		
		<%= %>
		위의 서식은 무조건 return 값이 있는 경우에만 사용이 가능하다
		그렇기에 for문이나 if 같은 경우는 사용하지 못한다. 함수는 return이 있으면 가능하다		
		--%>		
		NAME : <%=request.getAttribute("name") %></br>
		AGE : <%=request.getAttribute("age") %></br>
		
		<%-- Expression Language
		${해당 Attribute에 해당하는 값을 리턴한다.}
		 --%>
		NAME : ${name}</br>
		AGE : ${age}</br>
		
		<%-- NAME : <%=application.getAttribute("name") %><br>
		AGE  : <%=application.getAttribute("age") %><br> --%>
		<%-- application.getAttribute를 통해 servletcontext에 저장된 정보에 접근한다. --%>
		
		
		Response Contents
	</body>
</html>