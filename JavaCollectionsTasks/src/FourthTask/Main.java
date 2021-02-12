package FourthTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vegetable> vegetableList =  new ArrayList<Vegetable>(){{
            add(new Carrot(13));
            add(new Potato(12));
            add(new Tomato(15));
            add(new Corn(16));

        }};

        Salad salad = new Salad(vegetableList);
        Collections.sort(salad.getVegetables());
        System.out.println(salad.toString());
        System.out.println(salad.getVegetableByCalories(12));

    }
}
