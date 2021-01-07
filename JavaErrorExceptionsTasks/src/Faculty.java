import java.util.List;

public class Faculty {
    private String name;
    private List<Group> groups;

    public Faculty(String name, List<Group> groups) throws SizeException{
        this.name = name;


        if(!isEmpty())
            this.groups = groups;
        else
            throw new SizeException("size = 0");
    }

    public Boolean isEmpty(){
        if(groups.size()==0){
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Double AverageMarkOfSubject(String subjectName){
        Double averageMark = 0.;
        int size = 0;
        for(Group group:groups){
            for(Student student: group.getStudents()){
                for(SubjectMarks subject: student.getSubjectMarks()){
                    if(subject.getSubjectName().equals(subjectName)) {
                        size += subject.getMarks().size();
                        for(Double mark: subject.getMarks()){
                            averageMark+=mark;
                        }
                    }
                }
            }
        }
        return averageMark/size;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
