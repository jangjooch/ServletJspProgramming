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

public class DispatcherServlet07 extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// Application
		ServletContext sc = request.getServletContext();
		// 가져올 수 있는 ServletContext가 있는 지 확인한다.
		// 없다면 초기화를 진행하고 있다면 그냥 넘기어 기존 값을 유지한다.
		if(sc.getAttribute("applicationCounter") == null) {
			// 즉 Client에서 처음으로 생성되었을 경우에만 덮어쓰기가 되고
			// 그렇지 않으면 기존의 값을 유지한다.
			Counter applicationCounter = new Counter();
			applicationCounter.setValue(10);		
			sc.setAttribute("applicationCounter", applicationCounter);
			// 같은 키로 저장하면 덮어쓰기가 된다.
			// 즉 클라이언트에 따라 초기화가 되지 않도록 하는것이다.
			// 만약 위와 같이 if로 걸러주지 않는다면 다른 브라우져를 통해 새로운 Client를
			// 생성하여도 ServletContext는 계속 살아있기에 값이 초기와 되지 않는다.
		}		
		
		// Session
		HttpSession session = request.getSession();
		// 가져올 수 있는 session이 있는지 확인한다. 즉 새로운 Client인지
		// 확인하는 것이다. 만약 동일 Client라면 값을 계속 유지하도록 넘기고
		// 그렇지 않다면 값을 초기화하는 것이다.
		if(session.getAttribute("sessionCounter") == null) {
			Counter sessionCounter = new Counter();
			sessionCounter.setValue(100);
			session.setAttribute("sessionCounter", sessionCounter);
			// ServletContext와 달리 새로운 Client가 생길 시 (다른 브라우져에서 실행시)
			// 다른 session이 생성되어 값이 초기와 된다.
		}
		
		// Request
		if(request.getAttribute("requestCounter") == null) {
			Counter requestCounter = new Counter();
			requestCounter.setValue(1000);
			request.setAttribute("requestCounter", requestCounter);
		}
		
		// forward
		RequestDispatcher rd = request.getRequestDispatcher("/dispatcher08");
		// Servlet으로 등록된 경로를 준다.
		rd.forward(request, response);
		// 이렇게 함으로서 request를 DispatcherServlet08에 전달하여 응답이 이루어지도록 한다.
		// 아직 response를 하지 않았기에 DispatcherServlet08에서 접근이 가능하다.
		// 위 코드를 통해 DispatcherServlet07이 실행되어도
		// DispatcherServlet08이 자동적으로 실행됨을 알 수 있다.
		// 그렇기에 여기까지가 request의 범위이다.
		
	}
	
	
}
