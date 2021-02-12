package OptionalTask;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OptionalTask3 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\User\\IdeaProjects\\\\JavaIOTasks\\src\\randomText.txt";
        String result = "C:\\Users\\User\\IdeaProjects\\\\JavaIOTasks\\src\\ResultsOfTasks\\randomText.txt";
        String contents = readUsingFiles(fileName);
        Scanner scanner = new Scanner(contents);
        PrintWriter writerResult = new PrintWriter(result);
        while(scanner.hasNextLine()){
            StringBuffer sbr = new StringBuffer(scanner.nextLine());
            writerResult.println(sbr.reverse());
            System.out.println(sbr.reverse());
        }
        writerResult.close();
    }

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)))  ;
    }
}
