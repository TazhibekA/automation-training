package SecondTask;





import java.util.List;

public class Gift {
    private double weight;
    private List<Candy> candies;

    public Gift(List<Candy> candies) {
        this.weight =  TotalPrice(candies);
        this.candies = candies;
    }

    private double TotalPrice(List<Candy> bouquet){
        double sum = 0;
        for(Candy flower: bouquet){
            sum += flower.getWeight();
        }
        return sum;
    }
    private boolean HasCandyWithLength(int sugar){
        for(Candy candy:candies){
            if(candy.getSugar()==sugar) {
                return true;
            }
        }
        return false;
    }

    public Candy FindCandy(int sugar){
        if(this.HasCandyWithLength(sugar)){
            for(Candy candy:candies){
                if(candy.getSugar()==sugar) {
                    return candy;
                }
            }
        }
        return null;
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
