package MainTasks;

public class MainTaskThird {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0;i < arr.length;i++){
            arr[i] = 10 + (int)(Math.random() * 11);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for(int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
