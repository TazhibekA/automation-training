import java.util.List;

public class Abiturient {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String phone;
    private List<Integer> marks;

    public Abiturient() {
        this.id = 0;
        this.lastName = "";
        this.firstName = "";
        this.middleName = "";
        this.address = "";
        this.phone = "";
        this.marks = null;
    }

    public Abiturient(int id, String lastName, String firstName, String middleName, String address, String phone, List<Integer> marks) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.phone = phone;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public boolean GoodMarks(){
        int m = 0;
        for(int i = 0;i < marks.size();i++){
            m = m + marks.get(i);
        }

        return (m/(marks.size()) < 4) ? false : true;
    }

    public int SumOfMarks(){
        int m = 0;
        for(int i = 0;i < marks.size();i++){
            m = m + marks.get(i);
        }

        return m;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", marks=" + marks +
                '}';
    }
}
