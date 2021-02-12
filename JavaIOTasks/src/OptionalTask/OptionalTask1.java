package OptionalTask;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class OptionalTask1 {
    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\User\\IdeaProjects\\\\JavaIOTasks\\src\\randomNumbers.txt";
        String result = "C:\\Users\\User\\IdeaProjects\\\\JavaIOTasks\\src\\ResultsOfTasks\\randomNumbers.txt";
        String contents = readUsingFiles(fileName);
        Scanner scanner = new Scanner(contents);
        List<Integer> list = new ArrayList<Integer>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        Collections.sort(list);
        System.out.print(list);
        PrintWriter writerResult = new PrintWriter(result);
        for(Integer number: list)
        writerResult.append(number +" ");
        writerResult.close();
    }

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)))  ;
    }
}
