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

    public Double getAverageMark()   {
        Double num = 0.;
        int size = groups.size();

        for (Group group : groups){
            num += group.getAverageMark();
        }
        return num / size;
    }

    public Double getAverageMarkBySubject(String subjectName)  {
        Double num = 0.;
        int size = groups.size();

        for (Group group : groups){
            num += group.getAverageMarkBySubject(subjectName);
        }
        return num / size;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
