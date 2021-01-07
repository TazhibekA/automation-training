package EighthTask;

public class Transport implements Comparable<Transport>{
    private String name;
    private int quantity;
    private Comfortness comfortness;
    private int baggage;

    public Transport(String name, int quantity, Comfortness comfortness, int baggage) {
        this.name = name;
        this.quantity = quantity;
        this.comfortness = comfortness;
        this.baggage = baggage;
    }

    public int getBaggage() {
        return baggage;
    }

    public void setBaggage(int baggage) {
        this.baggage = baggage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Comfortness getComfortness() {
        return comfortness;
    }

    public void setComfortness(Comfortness comfortness) {
        this.comfortness = comfortness;
    }


    @Override
    public int compareTo(Transport o) {
        if (this.comfortness.ordinal() > o.comfortness.ordinal())
            return 1;
        if (this.comfortness.ordinal() < o.comfortness.ordinal())
            return -1;
        else
            return 0;
    }
}
