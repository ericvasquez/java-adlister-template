import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/students")
public class ShowAllStudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        List<Student> students = DaoFactory.getStudentsDao().findAll();
        response.setContentType("text/html");
        String html = "";

        for (Student s: students ) {
            System.out.println("s.getName() = " + s.getName());
            System.out.println("s.getDob() = " + s.getDob());
            html += "<h2>" + s.getId() + "</h2>";
            html += "<h2>" + s.getName() + "</h2>";
            html += "<h2>" + s.getDob() + "</h2>";
            html += "<h2>" + s.getHeight() + "</h2>";
        }

        response.getWriter().println(html);
    }

}
