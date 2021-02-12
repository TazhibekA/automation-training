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
        return "\nFaculty ID: "  + id + "\nFaculty Name: "  + facultyName + "\nFaculty grades:"  + grades +'\n';
    }

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<Student>();
        for(Grade grade :grades){
            students.addAll(grade.getAllStudents());
        }
        return  students;
    }

    public List<Group> getAllGroups(){
        List<Group> groups = new ArrayList<Group>();
        for(Grade grade :grades){
            groups.addAll(grade.getGroups());
        }
        return groups;
    }
}
