public class House {
    private int id;
    private int numberApart;
    private int space ;
    private int floor;
    private int countOfRooms;
    private String street;
    private String typeBuild;
    private String lifeTime;

    public House() {
        this.id = 0;
        this.numberApart = 0;
        this.space = 0;
        this.floor = 0;
        this.countOfRooms = 0;
        this.street = "";
        this.typeBuild = "";
        this.lifeTime = "";
    }


    public House(int id, int numberApart, int space, int floor, int countOfRooms, String street, String typeBuild, String lifeTime) {
        this.id = id;
        this.numberApart = numberApart;
        this.space = space;
        this.floor = floor;
        this.countOfRooms = countOfRooms;
        this.street = street;
        this.typeBuild = typeBuild;
        this.lifeTime = lifeTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberApart() {
        return numberApart;
    }

    public void setNumberApart(int numberApart) {
        this.numberApart = numberApart;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCountOfRooms() {
        return countOfRooms;
    }

    public void setCountOfRooms(int countOfRooms) {
        this.countOfRooms = countOfRooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getTypeBuild() {
        return typeBuild;
    }

    public void setTypeBuild(String typeBuild) {
        this.typeBuild = typeBuild;
    }

    public String getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(String lifeTime) {
        this.lifeTime = lifeTime;
    }
}
