import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@WebServlet(urlPatterns = "/students/create")
public class CreateStudentServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        Student newStudent = new Student();

        newStudent.setName(request.getParameter("name"));
        newStudent.setDob(new Date(request.getParameter("dob")));
        newStudent.setHeight(Integer.parseInt(request.getParameter("height")));

        DaoFactory.getStudentsDao().add(newStudent);

        response.sendRedirect("/students");

    }

}
