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
        return "\nGrade ID: "  + id + "\nGrade groups:\n "  + groups;
    }



    public List<Student> SaveAllStudents(){
        List<Student> students = new ArrayList<Student>();
        for(int i = 0;i < groups.size();i++){
            for(int j=0;j< groups.get(i).getStudents().size();j++){
                    students.add(groups.get(i).getStudents().get(j));
            }
        }
        return students;
    }






}
