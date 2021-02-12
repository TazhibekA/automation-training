package FourthTask;
import java.util.List;

public class Salad {
    private double totalCalories;
    private List<Vegetable> vegetables;

    public Salad(List<Vegetable> vegetables) {
        this.totalCalories = getTotalCalories(vegetables);
        this.vegetables = vegetables;
    }

    private double getTotalCalories(List<Vegetable> vegetables){
        double sum = 0;
        for(Vegetable vegetable: vegetables){
                sum += vegetable.getCalories();
        }
        return sum;
    }

    public Vegetable getVegetableByCalories(int calories){
            for(Vegetable vegetable:vegetables){
                if(vegetable.getCalories()==calories) {
                    return vegetable;
                }
            }
        return null;
    }

    public boolean isVegetableWithCaloriesPresent(int calories){
        return getVegetableByCalories(calories) != null;
    }

    public List<Vegetable> getVegetables() {
        return vegetables;
    }

    public void setVegetables(List<Vegetable> vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Salad{" +
                "vegetables=" + vegetables +
                '}';
    }
}
