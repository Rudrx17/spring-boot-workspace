package in.strikes.filterDemo.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.UUID;

@Component
@Order(2)
public class LoggingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request,
                         ServletResponse response,
                         FilterChain chain)
            throws IOException, ServletException {

        Long startTime = System.currentTimeMillis();

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;

        String requestId = UUID.randomUUID().toString();

        httpResponse.setHeader("X-Request-ID",requestId);


        // Request Log
        System.out.println("Incoming request : "
                + httpRequest.getMethod() + " "
                + httpRequest.getRequestURI() );

        try {
            chain.doFilter(request,response);

        }
        finally {
            long duration = System.currentTimeMillis() - startTime;

            // Response status log
            System.out.println("Response status : "
                    + httpResponse.getStatus());

            System.out.println("API Response time : " + duration);
        }




    }
}
