import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ExapmleTaskEvenNumbers {
    public static void main(String[] args) {
        System.out.print("Enter digits divided by space: ");
        Scanner scan = new Scanner(System.in);
        String s[]= scan.nextLine().split(" ");
        ArrayList<String> str = new ArrayList<String>(Arrays.asList(s));
        ArrayList<String> evens = new ArrayList<String>();
        for(int i = 0; i < str.size(); i++){
            for(int j = 0; j < str.get(i).length(); j++){
                int c = Character.getNumericValue((str.get(i)).charAt(j));
                if(c % 2 == 1){
                    break;
                }
                if(j == str.get(i).length()-1){
                    evens.add(str.get(i));
                }
            }
        }
        System.out.println(evens.toString());

    }
}
