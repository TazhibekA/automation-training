package FirstTask;

import java.util.List;

public class Bouquet {
    private double totalPrice ;
    private List<Flower> bouquet;

    public Bouquet(List<Flower> bouquet) {
        this.totalPrice = getTotalPrice(bouquet);
        this.bouquet = bouquet;
    }

    public List<Flower> getBouquet() {
        return bouquet;
    }

    public void setBouquet(List<Flower> bouquet) {
        this.bouquet = bouquet;
    }

    private double getTotalPrice(List<Flower> bouquet){
        double sum = 0;
        for(Flower flower: bouquet){
            sum += flower.getPrice();
        }
        return sum;
    }

    public Flower getFlowerByLength(int length){
        for(Flower flower:bouquet){
            if(flower.getLength()==length) {
                return flower;
            }
        }
         return null;
    }

    public boolean isFlowerWithLenghtPresent(int lenght){
        return getFlowerByLength(lenght) != null;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "totalPrice=" + totalPrice +
                ", bouquet=" + bouquet +
                '}';
    }
}
