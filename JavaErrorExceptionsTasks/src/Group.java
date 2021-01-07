import java.util.List;

public class Group {
    private String name;
    private List<Student> students;

    public Group(String name, List<Student> students) throws SizeException{
        this.name = name;

        if(!isEmpty())
            this.students = students;
        else
            throw new SizeException("size = 0");
    }

    public String getName() {
        return name;
    }

    public Boolean isEmpty(){
        if(students.size()==0){
            return true;
        }
        return false;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
