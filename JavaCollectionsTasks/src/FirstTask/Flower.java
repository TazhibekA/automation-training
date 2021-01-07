package FirstTask;

public abstract class Flower implements Comparable<Flower>{
    private double price;
    private String color;
    private double length;
    private Freshness freshness;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Flower(double price, String color, double length, Freshness freshness) {
        this.price = price;
        this.color = color;
        this.length = length;
        this.freshness = freshness;
    }


    @Override
    public int compareTo(Flower o) {
        if (this.freshness.ordinal() > o.freshness.ordinal())
            return 1;
        if (this.freshness.ordinal() < o.freshness.ordinal())
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "price=" + price +
                ", color='" + color + '\'' +
                ", length=" + length +
                ", freshness=" + freshness +
                '}';
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}


