package practice_project_assisted_practice_1;

import java.io.IOException;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/genericServlet")
public class P03 extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        // Set the content type to text/html
        response.setContentType("text/html");

        // Get the writer from the response
        var writer = response.getWriter();

        // Write an HTML response
        writer.write("<h1>Hello from Generic Servlet</h1>");
        writer.write("<p>This servlet uses GenericServlet.</p>");
    }
}
