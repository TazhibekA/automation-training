package MainTasks;
import java.io.IOException;
import java.util.Scanner;

public class MainTaskSecond {
    public static void main(String[] args) throws IOException {
        System.out.print("Enter arguments divided by space: ");
        Scanner scan = new Scanner(System.in);
        StringBuffer str = new StringBuffer(scan.nextLine());
        str.reverse();
        System.out.println(str.toString());
    }
}
