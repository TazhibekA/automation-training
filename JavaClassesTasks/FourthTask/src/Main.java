import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Abiturient> abiturients = new ArrayList<Abiturient>();
        abiturients.add(new Abiturient(1,"Romanov", "", "", "", "1131546", Arrays.asList(5, 2, 3, 5, 4)));
        abiturients.add(new Abiturient(2,"Lenin", "", "", "", "1565465",Arrays.asList(4,5,5,4,5)));
        abiturients.add(new Abiturient(3,"Stalin", "", "", "" , "2232323",Arrays.asList(2,3,2,3,2)));
        abiturients.add(new Abiturient(4,"Khrushchev", "", "", "" , "2000000",Arrays.asList(5,5,5,5,5)));
        abiturients.add(new Abiturient(5,"Brezhnev", "", "", "" , "1000000",Arrays.asList(2, 2, 3)));
        abiturients.add(new Abiturient(6,"Andropov", "", "", "" , "2555555",Arrays.asList(4, 2, 3)));
        abiturients.add(new Abiturient(7,"Gorbachev", "", "", "" , "3000000",Arrays.asList(5, 2, 3)));
        abiturients.add(new Abiturient(8,"Yeltsin", "", "", "" , "4000000",Arrays.asList(5, 5, 4)));
        abiturients.add(new Abiturient(9,"Putin", "", "", "" , "5000000", Arrays.asList(4, 5, 4)));

        for(Abiturient abiturient : abiturients){
            if(abiturient.GoodMarks()){
            System.out.println(abiturient.toString());
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("Type number: ");

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(Abiturient abiturient : abiturients){
            if(abiturient.SumOfMarks() >= number){
                System.out.println(abiturient.toString());
            }
        }
        System.out.println("Type count: ");

        List<Abiturient> maxInt = new ArrayList<Abiturient>();
        Scanner scan1 = new Scanner(System.in);
        int number1 = scan1.nextInt();
        if(number1>abiturients.size() && abiturients.size()<=0){
            System.out.println(number1 + " more than size or less than 0");
        }
        else {
            int max = 0;
            for (int i = 0; i < abiturients.size(); i++) {
                for (int j = 0; j < abiturients.size(); j++) {
                    if (abiturients.get(max).SumOfMarks() > abiturients.get(j).SumOfMarks()) {
                        max = j;
                    }
                }
                maxInt.add(abiturients.get(max));
                abiturients.remove(max);
                max = 0;
            }
            for(Abiturient abiturient : abiturients){
                    System.out.println(abiturient.toString());
            }


        }

    }






        
        
        


}

