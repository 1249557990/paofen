package me.zohar.runscore.config.security.xss;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * Xss攻击过滤器
 *
 */
public class XssFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String path = httpRequest.getServletPath();
		String[] exclusionsUrls = { ".js", ".gif", ".jpg", ".png", ".css", ".ico" };
		for (String str : exclusionsUrls) {
			if (path.contains(str)) {
				chain.doFilter(request, response);
				return;
			}
		}
		chain.doFilter(new XssHttpServletRequestWrapper(httpRequest), response);
	}

	@Override
	public void destroy() {

	}
}
