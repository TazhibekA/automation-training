package SecondTask;

public class Candy implements Comparable<Candy>{
    private double sugar;
    private double weight;
    private double price;

    public Candy(double sugar, double weight, double price) {
        this.sugar = sugar;
        this.weight = weight;
        this.price = price;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Candy o) {
        if (this.price > o.price)
            return 1;
        if (this.price < o.price)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "sugar=" + sugar +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
