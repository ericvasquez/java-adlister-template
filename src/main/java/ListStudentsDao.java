import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ListStudentsDao implements Students {

    List<Student> students;

    public ListStudentsDao(){
        students = new ArrayList<>();
        students.add(new Student(1,"Fer", new Date("12/12/2016"), 185));
        students.add(new Student(2,"Daniel", new Date("11/12/2018"), 160));
        students.add(new Student(3,"Justin", new Date("12/12/2017"), 185));
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public Student findOne(long id) {
        return students.get( (int) id - 1);
    }

    @Override
    public void add(Student student) {
        student.setId(students.size() + 1);
        students.add(student);
    }
}
