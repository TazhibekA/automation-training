package SecondTask;
import java.util.List;

public class Gift {
    private double weight;
    private List<Candy> candies;

    public Gift(List<Candy> candies) {
        this.weight =  getTotalPrice(candies);
        this.candies = candies;
    }

    private double getTotalPrice(List<Candy> bouquet){
        double sum = 0;
        for(Candy flower: bouquet){
            sum += flower.getWeight();
        }
        return sum;
    }

    public Candy getCandyBySugar(int sugar){
            for(Candy candy:candies){
                if(candy.getSugar()==sugar) {
                    return candy;
                }
            }
        return null;
    }

    public boolean isCandyWithSugarPresent(int sugar){
        return getCandyBySugar(sugar) != null;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public List<Candy> getCandies() {
        return candies;
    }

    public void setCandies(List<Candy> candies) {
        this.candies = candies;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "weight=" + weight +
                ", candies=" + candies +
                '}';
    }
}
