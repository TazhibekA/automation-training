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

    public Double getAverageMark(){
        Double num = 0.;
        int size = students.size();

        for (Student student : students){
           num += student.getAverageMark();
        }
        return num / size;
    }

    public Double getAverageMarkBySubject(String subjectName){
        Double num = 0.;
        int size = students.size();

        for (Student student : students){
            num += student.getAverageMarkBySubject(subjectName);
        }
        return num / size;
    }
}
