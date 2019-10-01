package company.web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharactorEncodingFilter implements Filter{
	
	private String encoding_str;
	
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("CharactorEncodingFilter init() Activate");
		encoding_str = filterConfig.getInitParameter("encoding");
		// web.xml에서 설정한 init-param을
		// 파라미터의 이름 encoding을 매게로서 encoding_str 값을 저장한다.
	}
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		// 특정 요청 다음에 Servlet이 이루어 질 수 있도록 한다.
		// FilterChain chain의 역할은 다중 Filter의 형태가 이루어 질 수 있도록 하는 역할이다.
		// Client -> Filter01 -> Filter 02 -> Servlets 이러한 형태로 여러 Filter를 거쳐 갈 수 있도록 한다.
		// 전처리. Filter할 과정
		request.setCharacterEncoding("UTF-8");
		// 단순히 UTF-8같은 고정적으로도 설정이 가능하지만
		request.setCharacterEncoding(encoding_str);
		System.out.println("CharactorEncodingFilter doFilter() Activate");
		// request는 공유 객체임으로 Servlet에 전달되는 request와 같기에 가능하다.
		
		
		// Filter Chain 설정		
		chain.doFilter(request, response);
		// 이 다음 필터가 있다면 해당 필터로 이동시키고, 없다면 요청에 따른 Servlet으로 이동하도록 한다.
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
	
}
