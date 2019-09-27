package company.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet01 extends HttpServlet{
	
	public DispatcherServlet01() {
		// TODO Auto-generated constructor stub
		System.out.println("Dispacter Create");
	}
	// <load-on-startup>1</load-on-startup>를 통하여
	// Deploy 할 때, Servlet dispatcher 객체를 미리 생성하여
	// 이후 웹서버 실행 시 더 빠르게 처리하도록 하는 것이다.
	
	private String xml_x, xml_y;
	// xml init param으로 전달받은 값을 service에서도 사용이 가능하도록
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Dispatcher init Active");
		xml_x = config.getInitParameter("x");
		// web.xml의 init-param에서 설정한 값 x를 가져온다.
		System.out.println("전달받은 x(" + xml_x + ")");
		
		xml_y = config.getInitParameter("y");
		// web.xml의 init-param에서 설정한 값 y를 가져온다.
		System.out.println("전달받은 y(" + xml_y + ")");
		
	}
	// 생성자 이후 객체 생성이후 초기화를 위해 실행된다.
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// client 요청 처리 메소드
		System.out.println("Dispatcher Activate service");
		int val_x = Integer.parseInt(xml_x);
		int val_y = Integer.parseInt(xml_y);
		System.out.println("Sum of two nums get from xml init param : "
						+ (val_x + val_y));
		
	}

}
