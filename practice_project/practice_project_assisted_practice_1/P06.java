package practice_project_assisted_practice_1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/sessionServlet")
public class P06 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set content type to text/html
        response.setContentType("text/html");

        // Get the cookies from the request
        Cookie[] cookies = request.getCookies();

        // Look for a session cookie
        String sessionID = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("sessionID")) {
                    sessionID = cookie.getValue();
                    break;
                }
            }
        }

        // If no session cookie is found, create a new session ID
        if (sessionID == null) {
            sessionID = "SESSION" + System.currentTimeMillis();
            Cookie sessionCookie = new Cookie("sessionID", sessionID);
            // Set the cookie's max age (in seconds) or set to -1 for session cookie (expires when browser closes)
            sessionCookie.setMaxAge(3600);
            response.addCookie(sessionCookie);
        }

        // Display the session ID
        response.getWriter().write("<h1>Session Tracking using Cookies</h1>");
        response.getWriter().write("<p>Session ID: " + sessionID + "</p>");
    }
}
