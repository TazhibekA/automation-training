package OptionalTasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OptionalTask4 {
    public static void main(String[] args) {
        List<String> texts = new ArrayList<String>();
        texts.add("Предвижу всё: вас оскорбит");
        texts.add("Печальной тайны объясненье.");
        texts.add("Какое горькое презренье");
        texts.add("Ваш гордый взгляд изобразит!");
        texts.add("Чего хочу? с какою целью");
        Collections.sort(texts, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                }
                if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return 0;

                }
            }
        });

        System.out.println(texts);

    }


}
