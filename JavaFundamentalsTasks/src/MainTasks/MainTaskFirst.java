package MainTasks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainTaskFirst {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        System.out.println("Hello, " + str);
    }
}
