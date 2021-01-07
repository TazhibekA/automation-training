package FourthTask;
import java.util.List;

public class Salad {
    private double totalCalories;
    private List<Vegetable> vegetables;

    public Salad(List<Vegetable> vegetables) {
        this.totalCalories = TotalCalories(vegetables);
        this.vegetables = vegetables;
    }

    private double TotalCalories(List<Vegetable> vegetables){
        double sum = 0;
        for(Vegetable vegetable: vegetables){
                sum += vegetable.getCalories();
        }
        return sum;
    }

    private boolean HasVegetableCalories(int calories){
        for(Vegetable vegetable:vegetables){
            if(vegetable.getCalories()==calories) {
                return true;
            }
        }
        return false;
    }

    public Vegetable FindVegetable(int calories){
        if(this.HasVegetableCalories(calories)){
            for(Vegetable vegetable:vegetables){
                if(vegetable.getCalories()==calories) {
                    return vegetable;
                }
            }
        }
        return null;
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
