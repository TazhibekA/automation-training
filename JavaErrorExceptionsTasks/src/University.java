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

    public Double getAverageMark()   {
        Double num = 0.;
        int size = faculties.size();

        for (Faculty faculty : faculties){
            num += faculty.getAverageMark();
        }
        return num / size;
    }

    public Double getAverageMarkBySubject(String subjectName)  {
        Double num = 0.;
        int size = faculties.size();

        for (Faculty faculty : faculties){
            num += faculty.getAverageMarkBySubject(subjectName);
        }
        return num / size;
    }


}
