import java.util.ArrayList;
import java.util.List;

public class Grade {
    private int id;
    private List<Group> groups;

    public Grade(int id, List<Group> groups) {
        this.id = id;
        this.groups = groups;
    }

    public Grade() {
        this.id = 0;
        this.groups = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "Grade ID: "  + id + "\nGrade groups:"  + groups + '\n';
    }

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<Student>();
        for(Group group :groups){
          students.addAll(group.getStudents());
        }
        return  students;
    }
}
