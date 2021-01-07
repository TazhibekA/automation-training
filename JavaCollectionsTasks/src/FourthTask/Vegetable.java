package FourthTask;

public class Vegetable implements Comparable<Vegetable>{
    private double calories;

    public Vegetable(double calories) {
        this.calories = calories;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    @Override
    public int compareTo(Vegetable o) {
        if (this.calories > o.calories)
            return 1;
        if (this.calories < o.calories)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                 this.getClass() + " ," +
                "calories=" + calories +
                '}';
    }
}
