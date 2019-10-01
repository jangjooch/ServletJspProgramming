package company.web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet06 extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// HttpServletRequest request 요청관련 객체
		// HttpServletResponse response 응답관련 객체
		// 둘다 공유객체이다.
		System.out.println("Activate Dispatcher06 doGet");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		// request로 받은 파라미터 값들을 받는다.
		
		request.setAttribute("title", title);
		request.setAttribute("content", content);
		// resquest.setAttribute(Key 값, Value 값);
		// jsp에서 데이터를 주기위해 공유객체 request의 속성값으로 저장한다.
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/dispatcher06.jsp");
		rd.forward(request, response);
		// Servlet에서 forward를 통하여 변경된 내용이 있는 공유객체 request와 response를 저장한다.
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Activate Dispatcher06 doPost");
		
		request.setCharacterEncoding("UTF-8");
		// doGet으로 받는 내용은 기본적으로 ASCII값으로 전달되기때문에 이를
		// doPost로 받게된다면 인코딩이 깨진 내용을 얻을 수 있다.
		// Filter에서 등록하였기에 굳이 필요하지 않지만 사용이 가능하다.
		
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		// request로 받은 파라미터 값들을 받는다.
		
		request.setAttribute("title", title);
		request.setAttribute("content", content);
		// resquest.setAttribute(Key 값, Value 값);
		// jsp에서 데이터를 주기위해 공유객체 request의 속성값으로 저장한다.
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/dispatcher06.jsp");
		rd.forward(request, response);
	}
	
}
