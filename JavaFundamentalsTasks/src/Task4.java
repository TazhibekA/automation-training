import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.print("Enter digits divided by space: ");
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        int mult = 1;
        String s[]= scan.nextLine().split(" ");
        int a[] = new int[s.length];

        for(int i =0 ;i < s.length;i++)
        {
            a[i]= Integer.parseInt(s[i]);
            sum += a[i];
            mult *= a[i];

        }
        System.out.println("sum:" + sum );
        System.out.println("mult:" + mult);

    }
}
