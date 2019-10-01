package company.web.contextlistener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextLoaderListener implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("contextInitialized Activate");
		// 서버 Deploy 시 Filter 시작 전 실행됨
		ServletContext application = sce.getServletContext();
		String contextConfigLocation = application.getInitParameter("contextConfigLocation");
		System.out.println("read " + contextConfigLocation + " and bulid Spring WebApplicationContext");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("contextDestroyed Activate");
		// 서버의 UnDeploy이 끝날 때, 시작함
	}
}
