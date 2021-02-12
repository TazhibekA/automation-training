package FirstTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flower> bouquetList = new ArrayList<Flower> (){{
            add(new Lilly(1200,"red",20,Freshness.MIDDLEFRESH));
            add(new Rose(1200,"red",15,Freshness.FULLFRESH));
            add(new Iris(1200,"red",25,Freshness.OLDFRESH));
            add(new Violet(1200,"red",5,Freshness.FULLFRESH));
        }};

        Bouquet bouquet = new Bouquet(bouquetList);
        Collections.sort(bouquet.getBouquet());
        System.out.println(bouquet.toString());
        System.out.println(bouquet.getFlowerByLength(25));

    }
}
