import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

    @WebServlet(name = "HelloWorldServlet", urlPatterns = "/")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Ad firstAd = (Ad) request.getSession().getAttribute("firstAdSeen");
        System.out.println(firstAd.getDescription());
        response.getWriter().println("<h1>Hello, World!</h1> ${firstAd.getTitle()}");

    }
}
