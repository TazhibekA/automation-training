import java.util.List;

public class SubjectMarks {
    private String subjectName;
    private List<Double> marks;

    public SubjectMarks(String subjectName, List<Double> subjectMarks) throws IllegalMarkException {
        this.subjectName = subjectName;
        for(Double mark :subjectMarks){
            if(mark > 10 || mark < 0){
                throw new IllegalMarkException("Illegal mark");}
        }
        this.marks = subjectMarks;

    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {

        this.subjectName = subjectName;
    }

    public List<Double> getMarks() {
        return marks;
    }

    public void setMarks(List<Double> subjectMarks) throws IllegalMarkException {
        for(Double mark :subjectMarks){
            if(mark > 10 || mark < 0){
                throw new IllegalMarkException("Illegal mark");}
        }
        this.marks = subjectMarks;
    }

    public Boolean isEmpty(){
        if(marks.size()==0){
            return true;
        }
        return false;
    }


    public Double AverageMark() throws SizeException{
        Double av = 0.;
        if(!isEmpty()){
            for(Double num: marks){
                av += num;
            }
            return av/marks.size();
        }
        else
           throw new SizeException("size = 0");

    }
}
