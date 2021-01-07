import java.util.Scanner;

public class OptionalTask1 {
    public static void main(String[] args) {
        System.out.print("Enter digits divided by space: ");
        Scanner scan = new Scanner(System.in);
        String s[]= scan.nextLine().split(" ");
        int max = 0;
        int min = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i].length()>s[max].length()){
                max = i;
            }
            if(s[i].length()<s[min].length()){
                min = i;
            }
        }
        System.out.println("Max length num: "+s[max] +"   Length: " +s[max].length());
        System.out.println("Min length num: "+s[min] +"   Length: " +  s[min].length());

    }
}
