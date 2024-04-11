package practice_project_assisted_practice_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/sessionServlet")
public class P09 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtain or create an HttpSession object
        HttpSession session = request.getSession();

        // Retrieve a counter from the session (or initialize it)
        Integer counter = (Integer) session.getAttribute("counter");
        if (counter == null) {
            counter = 0;
        }

        // Increment the counter
        counter++;
        session.setAttribute("counter", counter);

        // Set the content type to text/html
        response.setContentType("text/html");

        // Write an HTML response
        response.getWriter().write("<h1>Session Tracking using HttpSession</h1>");
        response.getWriter().write("<p>Session ID: " + session.getId() + "</p>");
        response.getWriter().write("<p>You have visited this page " + counter + " times.</p>");
        response.getWriter().write("<a href=\"sessionServlet\">Refresh</a>");
    }
}
