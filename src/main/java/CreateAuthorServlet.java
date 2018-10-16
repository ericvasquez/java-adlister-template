import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CreateAuthorServlet", urlPatterns = "/authors/create")
public class CreateAuthorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/authors/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Author newAuthor = new Author(req.getParameter("fn"), req.getParameter("ln"));
        long id = DaoFactory.getAuthorsDao().insert(newAuthor);
        resp.sendRedirect("/authors?id=" + id);
    }
}
