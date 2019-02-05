import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Create a page that displays a number that goes up by 1 every time the /count page is viewed.
@WebServlet(name = "CounterServlet", urlPatterns = "/count")
public class CounterServlet extends HttpServlet {
    private int counter = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

//    Allow the user to pass a parameter in the query string to reset the counter.
        String reset = request.getParameter("reset");
        if(reset == null) {
            counter += 1;
        } else {
            counter = 0;
        }
        response.getWriter().println("<h1>The count is " + counter + ".</h1>");
    }
}