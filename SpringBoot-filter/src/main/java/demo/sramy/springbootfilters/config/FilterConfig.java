package demo.sramy.springbootfilters.config;

import demo.sramy.springbootfilters.filters.FilterA;
import demo.sramy.springbootfilters.filters.FilterB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;

@Configuration
public class FilterConfig {
    @Autowired
    FilterA filterA;

    @Autowired
    FilterB filterB;

    @Bean
    public FilterRegistrationBean<FilterA> setUpMyFilter() {
        FilterRegistrationBean<FilterA> filterRegistrationBean = new FilterRegistrationBean<>();
        // 过滤器顺序，这里是第一个
        filterRegistrationBean.setOrder(1);
        // 注册filterA
        filterRegistrationBean.setFilter(filterA);
        // 设置过滤uri
        filterRegistrationBean.setUrlPatterns(new ArrayList<>(Arrays.asList("/user/*", "/department/getAllDepartment")));
        return filterRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean<FilterB> setUpMyFilter2() {
        FilterRegistrationBean<FilterB> filterRegistrationBean = new FilterRegistrationBean<>();
        // 过滤器顺序，这里是第二个
        filterRegistrationBean.setOrder(2);
        // 注册filterB
        filterRegistrationBean.setFilter(filterB);
        // 设置过滤uri
        filterRegistrationBean.setUrlPatterns(new ArrayList<>(Arrays.asList("/user/*", "/department/geDepartmenttById")));
        return filterRegistrationBean;
    }
}
