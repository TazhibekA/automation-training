import java.util.ArrayList;
import java.util.Scanner;

public class OptionalTask3 {
    public static void main(String[] args) {
        System.out.print("Enter digits divided by space: ");
        Scanner scan = new Scanner(System.in);
        String s[]= scan.nextLine().split(" ");
        int allLength=0;
        int averageLength;

        for(int i = 0; i < s.length; i++){
             allLength += s[i].length();
        }
        averageLength = allLength/s.length;
        ArrayList<String> MoreNumbers = new ArrayList<String>();
        ArrayList<String> LessNumbers = new ArrayList<String>();

        for(int i = 0; i < s.length; i++){
            if(s[i].length()>averageLength) {
                MoreNumbers.add(s[i]);
            }
        }
        for(int i = 0; i < s.length; i++){
            if(s[i].length()<averageLength) {
                LessNumbers.add(s[i]);
            }
        }

        if(MoreNumbers.isEmpty()){
            System.out.println("No numbers more than average size!");
        }
        else {
            System.out.println("More than average length: " + MoreNumbers.toString());
        }

        if(LessNumbers.isEmpty()){
            System.out.println("No numbers less than average size!");
        }
        else {
            System.out.println("Less than average length: " + LessNumbers.toString());
        }



    }
}
