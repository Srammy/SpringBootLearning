package demo.srammy.springbootfilteranno.filters;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Order(2)
@WebFilter(filterName = "filterB", urlPatterns = {"/user/*", "/department/geDepartmenttById"})
public class FilterB implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("初始化过滤器B: " + filterConfig.getFilterName());
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("过滤器B开始执行");
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        System.out.println("请求uri为:" + request.getRequestURI());
        // 调用FilterChain接口对象的doFilter方法，向后续的过滤器传递请求或响应（链式）
        filterChain.doFilter(servletRequest, servletResponse);
        // 上面的doFilter方法执行结束后用户的请求已经返回
        System.out.println("过滤器B处理结束");
    }

    @Override
    public void destroy() {
        System.out.println("过滤器B已被销毁");
    }
}
