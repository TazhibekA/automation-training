import java.util.List;

public class University {
    private String name;
    private List<Faculty> faculties;

    public University(String name, List<Faculty> faculties) throws SizeException{
        this.name = name;

        if(!isEmpty())
            this.faculties = faculties;
        else
            throw new SizeException("size = 0");
    }

    public Boolean isEmpty(){
        if(faculties.size()==0){
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

    public List<Faculty> getFaculties() {
        return faculties;
    }

    public void setFaculties(List<Faculty> faculties) {
        this.faculties = faculties;
    }

    public Double AverageMarkOfSubject(String subjectName,String facultyName,String groupName){
        Double averageMark = 0.;
        int size = 0;
        for(Faculty faculty : faculties) {
            if(faculty.getName().equals(facultyName)) {
                for (Group group : faculty.getGroups()) {
                    if (group.getName().equals(groupName)) {
                        for (Student student : group.getStudents()) {
                            for (SubjectMarks subject : student.getSubjectMarks()) {
                                if (subject.getSubjectName().equals(subjectName)) {
                                    size += subject.getMarks().size();
                                    for (Double mark : subject.getMarks()) {
                                        averageMark += mark;
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        return averageMark/size;
    }


}
