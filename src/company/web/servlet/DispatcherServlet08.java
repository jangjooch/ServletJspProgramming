package company.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import company.web.dto.Counter;

public class DispatcherServlet08 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// application 범위에서 객체 가져오기
		ServletContext sc = request.getServletContext();
		Counter applicationCounter = (Counter)sc.getAttribute("applicationCounter");
		// Object형으로 전달 받으니까 형변환이 필요하다.
		if(applicationCounter != null) {
			// 키값 "applicationCounter"로 받을 수 있는 것이 있는 경우에만 실행 할 수 있도록
			applicationCounter.setValue(applicationCounter.getValue() + 10);
			System.out.println("applicationCounter : " + applicationCounter.getValue());
		}		

		// session 범위에서 객체 가져오기
		HttpSession session = request.getSession();
		Counter sessionCounter = (Counter)session.getAttribute("sessionCounter");
		if(sessionCounter != null) {
			sessionCounter.setValue(sessionCounter.getValue() + 100);
			System.out.println("sessionCounter : " + sessionCounter.getValue());
		}
		
		// request범위에서 객체 가져오기
		Counter requestCounter = (Counter)request.getAttribute("requestCounter");
		if(requestCounter != null) {
			requestCounter.setValue(requestCounter.getValue() + 1000);
			System.out.println("requestCounter : " + requestCounter.getValue());
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/dispatcher08.jsp");
		rd.forward(request, response);
		
	}
}
