package company.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet03 extends HttpServlet{
	
	public DispatcherServlet03() {
		// TODO Auto-generated constructor stub
		System.out.println("Dispacter Create");
	}
	
	/*
	 * @Override protected void service(HttpServletRequest req, HttpServletResponse
	 * resp) throws ServletException, IOException { // TODO Auto-generated method
	 * stub // client 요청 처리 메소드
	 * System.out.println("DispatcherServlet03 Service Activate"); }
	 */
	// service가 재정의 된 상태에서는 doGet doPost 둘다 가져가기때문에 조심해야 한다.
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("DispatcherServlet03 doGet run");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("DispatcherServlet03 doPost run");
	}

}
