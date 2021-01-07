import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class OptionalTask4 {
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        int overallEvens = 0;
        int overallOdds = 0;
        int evenDigits = 0;
        int oddDigits = 0;

        for (int s = 0; s < size; s++) {
            System.out.print("Enter " + (s + 1) + " : ");
            numbers[s] = sc.nextInt();
            ArrayList<Integer> digits = new ArrayList<>();
            while (numbers[s] != 0) {
                digits.add(numbers[s] % 10);
                numbers[s] /= 10;
            }

            for (int i = 0; i < digits.size(); i++) {
                if (digits.get(i) % 2 == 0)
                    evenDigits++;
                else
                    oddDigits++;
            }

            if (evenDigits == digits.size())
                overallEvens++;
            else if (evenDigits == oddDigits)
                overallOdds++;

            evenDigits = 0;
            oddDigits = 0;
        }
        System.out.println("Quantity of numbers containing only even digits : " + overallEvens + "\nQuantity of numbers with an equal number of even and odd digits : " + overallOdds);

    }
}
