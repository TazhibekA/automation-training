package SecondTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Candy> candiesList = new ArrayList<Candy>(){{
            add(new Chocolate(13,2,500));
            add(new Gum(12,2,550));
            add(new Lollipop(15,2,600 ));
            add(new Marshmallow(14,2,300));
        }};

        Gift gift = new Gift(candiesList);
        Collections.sort(gift.getCandies());
        System.out.println(gift.toString());
        System.out.println(gift.getCandyBySugar(15));
    }
}
