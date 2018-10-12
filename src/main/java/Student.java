import java.util.Date;

public class Student {

    private long id;
    private String name;
    private Date dob;
    private int height;

    public Student() {}

    public Student(long id, String name, Date dob, int height) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.height = height;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
