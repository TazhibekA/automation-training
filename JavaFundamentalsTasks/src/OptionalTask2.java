import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class OptionalTask2 {
    public static void main(String[] args) {
        System.out.print("Enter size of array: ");
        Scanner in = new Scanner(System.in);
        String[] arr = new String[Integer.parseInt(in.nextLine())];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter " + (i+1) +" number: ");
            arr[i] = in.nextLine();
        }

        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( arr[j].length() > arr[j+1].length() ){
                    String tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        System.out.println("Ascended array: ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("Descended array: ");
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.println(arr[i]);
        }

    }

}
