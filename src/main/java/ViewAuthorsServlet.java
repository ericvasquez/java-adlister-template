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

            DaoFactory.getAuthorsDao().all();
//        request.setAttribute("ads", DaoFactory.getAdsDao().all());
//        request.getRequestDispatcher("/WEB-INF/ads/index.jsp").forward(request, response);
    }
}
