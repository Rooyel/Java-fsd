package practice_project_assisted_practice_1;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/hello")
public class P05 implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialize filter (if needed)
        System.out.println("LoggingFilter initialized.");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        // Log request details
        String remoteAddr = request.getRemoteAddr();
        System.out.println("Request received from IP: " + remoteAddr);

        // Continue the request-response chain
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        // Clean up resources (if needed)
        System.out.println("LoggingFilter destroyed.");
    }
}
