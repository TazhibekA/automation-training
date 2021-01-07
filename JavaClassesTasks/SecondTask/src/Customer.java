public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String cardNumber;
    private String shetNumber;

    public Customer() {
        this.id = 0;
        this.lastName = " ";
        this.firstName = " ";
        this.middleName = " ";
        this.address = " ";
        this.cardNumber = " ";
        this.shetNumber = " ";
    }

    public Customer(int id, String lastName, String firstName, String middleName, String address, String cardNumber, String shetNumber) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.shetNumber = shetNumber;
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

    public String getShetNumber() {
        return shetNumber;
    }

    public void setShetNumber(String shetNumber) {
        this.shetNumber = shetNumber;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", address='" + address + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", shetNumber='" + shetNumber + '\'' +
                '}';
    }


}
