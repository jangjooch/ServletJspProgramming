<%@ page contentType="text/html; charset=UTF-8" %>

<!-- charset 설정을 위함. 기존에는 이상하게 되어있다. -->

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<style type="text/css">
			html, body{
				height: 100%;
			}
			#wrapper{
				width: 100%;
				height: 100%;
				display: flex;
				flex-direction: column;
				/* position: fixed;
				top: 0px;
				right: 0px;
				bottom: 0px;
				left: 0px; */
			}
			#header{
				border-bottom: 3px solid black;
				margin-bottom: 15px
			}
			#content{
				flex-grow: 1;
				height: 95%;
				display: flex;
				min-height: 0;
				/* flex-direction: row ê° ëí´í¸ì´ë¤.*/
			}
			#sideBar{
				width: 300px;
				height : 500px;
				background-color: gray;
				padding-right: 15px;
				border-right: 3px solid black;
				overflow-y: scroll;
				<%-- 간혹 height 정보가 없으므로 인하여 오류가 발생하기도 한다. --%>
			}
			#center{				
				flex-grow: 1;
				padding : 20px;
				
			}
			#center iframe{
				margin-top: 0px;
				width: 100%;
				height: 100%;
			}
			#footer{
				border-top: 3px solid black;
				margin-top: 15px
			}
		</style>
		
</head>
<body>

	<div id = "wrapper">
		<div id = "header">
			<h3>Servlet JSP Programming</h3>
		</div>
		<div id = "content">
			<div id = "sideBar">
				<ul>
					<li><a href = "dispatcher01" target="iframe">서블릿 작성과 URL 매칭</a></li>
					<!-- href는 해당 URL 기준으로의 상대 경로를 잡을 수 있다. -->
					<!-- http://localhost:8080/ServletJspProgramming/index.jsp/의 URL 경로를 기본으로 가진다. -->
					<li><a href = "dispatcher02" target="iframe">서블릿 초기화</a></li>
					<li><a href = "dispatcher03?name=Kim&age=25&tel=123-456-789" target="iframe">Get방식으로 요청</a>
					<!-- a태그는 무조건 get방식으로 정보를 전달한다. -->
					<li>
						Dispatcher05 요청 파라미터 전달
						<form action="dispatcher05" method="get" target="iframe">
							<input type="text" name="name" value="Kim">
							<input type="number" name="age" value="28">
							<!-- <a 태그가 아닌 form태그를 이용한 정보 전달
							name = 파라미터 이름
							value = 파라미터 값 
							<input type="tel" name="tel" value="1111-2222">
							 -->
							<input type="submit" value = "Get 방식으로 요청">
						</form>
						<form action="dispatcher05" method="post" target="iframe">
							<input type="text" name="name" value="LEE">
							<input type="number" name="age" value="35">
							<!-- 
							<input type="tel" name="tel" value="1111-2222">
							 -->
							<input type="submit" value = "Post 방식으로 요청">
						</form>
						Dispatcer06 한글 파라미터 처리
						<form action="dispatcher06" method="get" target="iframe">
							<input type="text" name="title">
							<input type="text" name="content">
							<input type="submit" value = "GET 방식으로 요청">
						</form>
						<form action="dispatcher06" method="post" target="iframe">
							<input type="text" name="title">
							<input type="text" name="content">
							<input type="submit" value = "Post 방식으로 요청">
						</form>
						<!-- 설정을 하지 않는 경우 get으로 보낸 경우 한글이 저장이 이루어지는 것 같지만
						post로 다시 이를 받으려는 경우 깨진다. -->
					</li>
					<li>
						<p>객체 사용범위</p>
						<a href="dispatcher07" target = "iframe">객체 저장</a><br>
						<a href="dispatcher08" target = "iframe">객체 가져오기</a>
					</li>
					<li><a href = "dispatcher04" target="iframe">응답 보내기</a></li>
					<li><a href = "dispatcher05?name=Kim&age=25" target="iframe">요청 파라미터 받기</a></li>
					<!-- ?name=Kim&age=25 이러한 방식으로 파라미터를 작성을 하여 정보를 전달한다. -->
					<!-- 즉 URL에 파라미터를 넣고 보내는 행위로서 request한다. -->
				</ul>
			</div>
			<div id = "center">
				<iframe src="http://tomcat.apache.org/" name="iframe" frameborder="0"></iframe>
			</div>
		</div>
		<div id = "footer">2019. Iot. JSH</div>
	</div>
	
</body>
</html>