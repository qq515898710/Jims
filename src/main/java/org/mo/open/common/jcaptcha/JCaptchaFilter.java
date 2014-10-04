package org.mo.open.common.jcaptcha;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 针对 JCaptcha 专门的过滤器(Filter)  
 * 
 * @author moziqi
 */
public class JCaptchaFilter implements Filter {
	
	private static Logger logger = LoggerFactory.getLogger(JCaptchaFilter.class);
    //web.xml中的参数名定义   
    public static final String PARAM_CAPTCHA_PARAMTER_NAME = "captchaParamterName";   
    public static final String PARAM_CAPTCHA_SERVICE_ID = "captchaServiceId";   
    public static final String PARAM_FILTER_PROCESSES_URL = "filterProcessesUrl";   
    public static final String PARAM_FAILURE_URL = "failureUrl";   
    public static final String PARAM_AUTO_PASS_VALUE = "autoPassValue";  

    //默认值定义   
    public static final String DEFAULT_FILTER_PROCESSES_URL = "/j_spring_security_check";   
    public static final String DEFAULT_CAPTCHA_SERVICE_ID = "captchaService";   
    public static final String DEFAULT_CAPTCHA_PARAMTER_NAME = "j_captcha";   
       
    private String failureUrl;   
    private String filterProcessesUrl = DEFAULT_FILTER_PROCESSES_URL;   
    private String captchaServiceId = DEFAULT_CAPTCHA_SERVICE_ID;   
    private String captchaParamterName = DEFAULT_CAPTCHA_PARAMTER_NAME;   
    private String autoPassValue;   
	/**
	 * Default constructor.
	 */
	public JCaptchaFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	
}
