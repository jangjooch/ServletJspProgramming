package company.web.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DispatcherServlet02  extends HttpServlet{
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		String contextLoaction = config.getInitParameter("contextConfigLocation");
		System.out.println("contextLocation : " + contextLoaction);
		System.out.println("this will read the file in the path above."
				+ " and active it");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Dispatcher02 service() Activate");
	}
}
