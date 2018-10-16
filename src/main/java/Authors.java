import java.util.List;

public interface Authors {
    // get a list of all the authors
    List<Author> all();
    // insert a new author and return the new ad's id
    Long insert(Author author);
    // get one author at the time
    Author findOne(long id);
}
