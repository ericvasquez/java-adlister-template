import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ViewAuthorsServlet", urlPatterns = "/authors")
public class ViewAuthorsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            List<Author> authors = DaoFactory.getAuthorsDao().all();
            request.setAttribute("authors", authors);
            request.getRequestDispatcher("WEB-INF/authors/index.jsp").forward(request, response);
    }
}
