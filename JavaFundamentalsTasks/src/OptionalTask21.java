import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class OptionalTask21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int rows = in.nextInt();
        System.out.print("Enter columns: ");
        int columns = in.nextInt();
        int[][] array = new int[rows][columns];


        for(int i = 0; i < rows; i++){
            for(int j = 0;j < columns; j++){
                array[i][j] = 1 + (int)(Math.random() * 10);
            }
        }
        for (int i[] : array)
        {
            for (int j : i)
                System.out.print(String.format("%3d", j));
            System.out.println();
        }
        System.out.print("Choose column: ");
        int n = in.nextInt();
        Arrays.sort(array, (x, y) -> y[n]-x[n]);
        System.out.println("\nSorted: ");
        for (int i[] : array)
        {
            for (int j : i)
                System.out.print(String.format("%3d", j));
            System.out.println();
        }

    }
}
