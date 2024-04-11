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
public class P07 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtain or create an HttpSession object
        HttpSession session = request.getSession();

        // Retrieve the session ID
        String sessionID = session.getId();

        // Set the content type to text/html
        response.setContentType("text/html");

        // Write an HTML response
        response.getWriter().write("<h1>Session Tracking using URL Rewrite</h1>");
        response.getWriter().write("<p>Session ID: " + sessionID + "</p>");

        // Generate a URL with the session ID appended (URL rewriting)
        String baseURL = request.getRequestURL().toString();
        String urlWithSession = response.encodeURL(baseURL);

        response.getWriter().write("<p><a href=\"" + urlWithSession + "\">Click here to continue the session</a></p>");
    }
}
