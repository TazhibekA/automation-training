import java.util.Date;

public class Book {
    private int id;
    private String name;
    private String author;
    private String publicity;
    private Date date;
    private int pages;
    private int cost;
    private String typeOfTrip;

    public Book() {
        this.id = 0;
        this.name = "";
        this.author = "";
        this.publicity = "";
        this.date = null;
        this.pages = 0;
        this.cost = 0;
        this.typeOfTrip = "";
    }

    public Book(int id, String name, String author, String publicity, Date date, int pages, int cost, String typeOfTrip) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publicity = publicity;
        this.date = date;
        this.pages = pages;
        this.cost = cost;
        this.typeOfTrip = typeOfTrip;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicity() {
        return publicity;
    }

    public void setPublicity(String publicity) {
        this.publicity = publicity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTypeOfTrip() {
        return typeOfTrip;
    }

    public void setTypeOfTrip(String typeOfTrip) {
        this.typeOfTrip = typeOfTrip;
    }
}
