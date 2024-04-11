package practice_project_assisted_practice_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class P10_1 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Get username and password from the request
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // For demonstration purposes, we assume the correct username is "user" and the password is "pass"
        if ("user".equals(username) && "pass".equals(password)) {
            // Obtain the session, create one if not already present
            HttpSession session = request.getSession();

            // Store the username in the session as an attribute
            session.setAttribute("username", username);

            // Redirect to the welcome page
            response.sendRedirect("welcome.jsp");
        } else {
            // Redirect to the login page with an error message
            response.sendRedirect("login.jsp?error=Invalid%20credentials");
        }
    }
}
