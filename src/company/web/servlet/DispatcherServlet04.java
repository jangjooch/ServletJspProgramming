package company.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet04 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HttpServletRequest req 요청관련 객체
		// HttpServletResponse resp 응답관련 객체
		
		/*
		방법 1

		response.setContentType("text/html;charset=UTF-8");
		// 응답 http의 헤더 부분에 존재하는 contextType을 설정.
		PrintWriter out = response.getWriter();
		// Writer에서 파생
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("	<head>");
		out.println("	</head>");
		out.println("	<body>");
		out.println("		<h4>DispatcherServlet04 response html</h4>");
		out.println("		Response Contents");
		out.println("	</body>");
		out.println("</html>");
		// 통신되는 부분의 수행부분인 Body에 작성되어 포함되어 전달된다.
		
		*/
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/dispatcher04.jsp");
		// "/WEB-INF/view/dispacher04.jsp"에 있는 jsp를 실행하기 위한 경로 설정 및 RequsetDispatcher 객체 설정
		// RequestDispatcher가 요청에 대한 응답을 어떠한 jsp로 할 것인지를 설정하는 것이다.
		// Servlet은 이미 서버 내부에 있기 때문에 WebContent 내부인 현재 위치에서 /WEB-INF/에 대한 접근이 가능하다.
		// 그렇기에 외부접근에 대한 특정 jsp의 접근을 방지 할 수 있다
		rd.forward(request, response);
		// 저장된 경로의 jsp를 받아와 실행한다.
		// 즉 이렇게 응답받은 곳에 대한 응답을 주는 것이다.
	}

}
