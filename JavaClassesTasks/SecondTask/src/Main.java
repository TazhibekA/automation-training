import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Romanov", "", "", "", "1131546",""));
        customers.add(new Customer(2,"Lenin", "", "", "", "1565465",""));
        customers.add(new Customer(3,"Stalin", "", "", "" , "2232323",""));
        customers.add(new Customer(4,"Khrushchev", "", "", "" , "2000000",""));
        customers.add(new Customer(5,"Brezhnev", "", "", "" , "1000000",""));
        customers.add(new Customer(6,"Andropov", "", "", "" , "2555555",""));
        customers.add(new Customer(7,"Gorbachev", "", "", "" , "3000000",""));
        customers.add(new Customer(8,"Yeltsin", "", "", "" , "4000000",""));
        customers.add(new Customer(9,"Putin", "", "", "" , "5000000",""));
        System.out.println("Список покупателей в алфавитном порядке: ");
        List<String> stl = new ArrayList<String>();
        for (Customer customer : customers) {
            stl.add(customer.getLastName());
        }
        Collections.sort(stl);
        for(String g : stl)
            for (Customer customer : customers)
                if (g == customer.getLastName())
                    System.out.println(customer.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Начало интервала: ");
        long begin = (long)scanner.nextInt();
        System.out.println("Конец интервала: ");
        long end = (long)scanner.nextInt();

        for(int i = 0;i < customers.size();i++){
            if(Long.parseLong(customers.get(i).getCardNumber())>=begin && Long.parseLong(customers.get(i).getCardNumber())<=end)
                System.out.println(customers.get(i).toString());
        }

    }
}
