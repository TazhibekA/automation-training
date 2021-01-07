import java.util.ArrayList;
import java.util.List;

public class Faculty {
    private int id;
    private String facultyName;
    private List<Grade> grades;

    public Faculty() {
        this.id = 0;
        this.facultyName = "";
        this.grades = null;
    }

    public Faculty(int id, String facultyName, List<Grade> grades) {
        this.id = id;
        this.facultyName = facultyName;
        this.grades = grades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
    public void add(Grade grade){
        grades.add(grade);
    }

    @Override
    public String toString() {
        return "\nFaculty ID: "  + id + "\nFaculty Name: "  + facultyName + "\nFaculty grades:\n "  + grades;
    }

    public List<Student> SaveAllStudents(){
        List<Student> students = new ArrayList<Student>();
        for(int i = 0;i < grades.size();i++){
            for(int j=0;j< grades.get(i).getGroups().size();j++){
                for(int k=0; k < grades.get(i).getGroups().get(j).getStudents().size();k++){
                    students.add(grades.get(i).getGroups().get(j).getStudents().get(k));
                }
            }
        }
        return students;
    }

    public List<Group> SaveAllGroups(){
        List<Group> groupList = new ArrayList<Group>();
        for(int i=0;i<grades.size();i++){
            for(int j=0;j<grades.get(i).getGroups().size();j++ )
            groupList.add(grades.get(i).getGroups().get(j));
        }
        return groupList;
    }





}
