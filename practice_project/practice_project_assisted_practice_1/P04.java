package practice_project_assisted_practice_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/myServlet")
public class P04 extends HttpServlet {

    // Handle GET requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type to text/html
        response.setContentType("text/html");

        // Get the writer from the response
        var writer = response.getWriter();

        // Write an HTML response
        writer.write("<h1>Hello from MyHttpServlet</h1>");
        writer.write("<p>This servlet handles GET requests.</p>");
    }

    // Handle POST requests
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type to text/html
        response.setContentType("text/html");

        // Get the writer from the response
        var writer = response.getWriter();

        // Write an HTML response
        writer.write("<h1>Received a POST request</h1>");
        writer.write("<p>Data received:</p>");

        // Read data from the request
        String requestData = request.getParameter("data");
        writer.write("<p>" + requestData + "</p>");
    }
}
