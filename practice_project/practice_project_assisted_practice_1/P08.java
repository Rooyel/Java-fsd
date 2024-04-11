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
public class P08 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtain or create an HttpSession object
        HttpSession session = request.getSession();

        // Retrieve the session ID
        String sessionID = session.getId();

        // Set the content type to text/html
        response.setContentType("text/html");

        // Write an HTML form with a hidden field containing the session ID
        response.getWriter().write("<h1>Session Tracking using Hidden Form Fields</h1>");
        response.getWriter().write("<form action=\"sessionServlet\" method=\"post\">");
        response.getWriter().write("<input type=\"hidden\" name=\"sessionID\" value=\"" + sessionID + "\"/>");
        response.getWriter().write("<label for=\"input\">Enter some text: </label>");
        response.getWriter().write("<input type=\"text\" name=\"input\" id=\"input\"/>");
        response.getWriter().write("<input type=\"submit\" value=\"Submit\"/>");
        response.getWriter().write("</form>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the session ID from the hidden form field
        String sessionIDFromForm = request.getParameter("sessionID");

        // Retrieve the session using the session ID
        HttpSession session = request.getSession();
        if (sessionIDFromForm.equals(session.getId())) {
            // Handle form submission (e.g., process the user's input)
            String userInput = request.getParameter("input");

            // Respond with a message showing the session ID and the user's input
            response.setContentType("text/html");
            response.getWriter().write("<h1>Form Submission</h1>");
            response.getWriter().write("<p>Session ID: " + sessionIDFromForm + "</p>");
            response.getWriter().write("<p>Your input: " + userInput + "</p>");
        } else {
            // If the session ID from the form does not match the session ID in the server, handle the error
            response.setContentType("text/html");
            response.getWriter().write("<p>Session ID mismatch. Please try again.</p>");
        }
    }
}
