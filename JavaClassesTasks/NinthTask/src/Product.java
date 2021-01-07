public class Product {
    private int id;
    private String name;
    private String UPC;
    private String manufacturer;
    private int cost;
    private int daysSave;
    private int count;

    public Product() {
        this.id = 0;
        this.name = "";
        this.UPC = "";
        this.manufacturer = "";
        this.cost = 0;
        this.daysSave = 0;
        this.count = 0;
    }

    public Product(int id, String name, String UPC, String manufacturer, int cost, int daysSave, int count) {
        this.id = id;
        this.name = name;
        this.UPC = UPC;
        this.manufacturer = manufacturer;
        this.cost = cost;
        this.daysSave = daysSave;
        this.count = count;
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

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getDaysSave() {
        return daysSave;
    }

    public void setDaysSave(int daysSave) {
        this.daysSave = daysSave;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
