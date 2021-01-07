import java.sql.Time;

public class Phone {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String cardNumber;
    private String debet;
    private String credit;
    private Time cityCall;
    private Time abroadCall;

    public Phone() {
        this.id = 0;
        this.lastName = "";
        this.firstName = "";
        this.middleName = "";
        this.address = "";
        this.cardNumber = "";
        this.debet = "";
        this.credit = "";
        this.cityCall = null;
        this.abroadCall = null;
    }

    public Phone(int id, String lastName, String firstName, String middleName, String address, String cardNumber, String debet, String credit, Time cityCall, Time abroadCall) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.debet = debet;
        this.credit = credit;
        this.cityCall = cityCall;
        this.abroadCall = abroadCall;
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

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDebet() {
        return debet;
    }

    public void setDebet(String debet) {
        this.debet = debet;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public Time getCityCall() {
        return cityCall;
    }

    public void setCityCall(Time cityCall) {
        this.cityCall = cityCall;
    }

    public Time getAbroadCall() {
        return abroadCall;
    }

    public void setAbroadCall(Time abroadCall) {
        this.abroadCall = abroadCall;
    }
}
