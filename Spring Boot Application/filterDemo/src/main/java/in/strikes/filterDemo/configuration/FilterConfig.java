package in.strikes.filterDemo.configuration;


import in.strikes.filterDemo.filters.DummyFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Filter;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<DummyFilter> getDummyFilterBean(){
        FilterRegistrationBean<DummyFilter> registrationBean =
                new FilterRegistrationBean<>();
        registrationBean.setFilter(new DummyFilter());
        //registrationBean.setOrder(1);
        registrationBean.addUrlPatterns("/api/*" ,"/admin/*");
        return registrationBean;
    }
}
