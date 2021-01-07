import java.util.List;

public class Student {
    private String name;
    private List<SubjectMarks> subjectMarks;

    public Student(String name, List<SubjectMarks> subjectMarks) throws SizeException{
        this.name = name;
        if(!isEmpty())
            this.subjectMarks = subjectMarks;
        else
            throw new SizeException("size = 0");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubjectMarks> getSubjectMarks() {
        return subjectMarks;
    }

    public void setSubjectMarks(List<SubjectMarks> subjectMarks) {
        this.subjectMarks = subjectMarks;
    }

    public Boolean isEmpty(){
        if(subjectMarks.size()==0){
            return true;
        }
        return false;
    }


    public Double AverageMark() throws SizeException{
        Double num = 0.;
        int size = 0;

            for (SubjectMarks subject : subjectMarks) {
                size += subject.getMarks().size();
                for (Double mark : subject.getMarks()) {
                    num += mark;
                }
            }
            return num / size;



    }

    public Double AverageMark(String subjectName) throws SizeException{
        Double num = 0.;
        int size = 0;

            for (SubjectMarks subject : subjectMarks) {
                if(subject.getSubjectName().equals(subjectName)) {
                    size += subject.getMarks().size();
                    for (Double mark : subject.getMarks()) {
                        num += mark;
                    }
                }
            }
            return num / size;

    }


}
