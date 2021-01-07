import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.Stack;

public class OptionalTask1 {



    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\User\\IdeaProjects\\\\JavaCollectionsTasks\\src\\input.txt";
        String result = "C:\\Users\\User\\IdeaProjects\\\\JavaCollectionsTasks\\src\\output.txt";
        Stack<String> stack = new Stack<>();


        String contents = readUsingFiles(fileName);

        Scanner scanner = new Scanner(contents);
        while(scanner.hasNextLine()){
            stack.push(scanner.nextLine());
        }

        PrintWriter writerResult = new PrintWriter(result);
        int lim = stack.size();
        for (int i = 0; i < lim; i++) {
            writerResult.println(stack.pop());
        }
        writerResult.close();
    }

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)))  ;
    }
}
