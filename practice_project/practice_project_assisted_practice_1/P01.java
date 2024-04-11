package practice_project_assisted_practice_1;


import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetPostServlet")
public class P01 extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Handle GET requests
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get query parameters from the URL
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        out.println("<html><body>");
        out.println("<h2>GET Request</h2>");
        out.println("Name: " + name + "<br>");
        out.println("Age: " + age + "<br>");
        out.println("</body></html>");

        out.close();
    }

    // Handle POST requests
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get parameters from the request body
        String name = request.getParameter("name");
        String age = request.getParameter("age");

        out.println("<html><body>");
        out.println("<h2>POST Request</h2>");
        out.println("Name: " + name + "<br>");
        out.println("Age: " + age + "<br>");
        out.println("</body></html>");

        out.close();
    }
}
