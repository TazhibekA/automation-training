import java.util.ArrayList;
import java.util.List;

public class Group {
    private int id;
    private String groupName;
    private List<Student> students;

    public Group(int id, String groupName, List<Student> students) {
        this.id = id;
        this.groupName = groupName;
        this.students = students;
    }

    public Group() {
        this.id = 0;
        this.students = null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void add(Student student){
        students.add(student);
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "\nGroup ID: " + id + "\nGroup Name: " + groupName + "\nGroup students:\n" + students;
    }

    public List<Student> SaveAllStudents(){
        List<Student> students = new ArrayList<Student>();
        for(int i = 0;i < students.size();i++){
                students.add(students.get(i));
        }
        return students;
    }



}
