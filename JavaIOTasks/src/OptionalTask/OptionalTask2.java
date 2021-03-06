package OptionalTask;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class OptionalTask2 {
    public int a;
    public int b;

    public static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\User\\IdeaProjects\\\\JavaIOTasks\\src\\OptionalTask2.java";
        String result = "C:\\Users\\User\\IdeaProjects\\\\JavaIOTasks\\src\\ResultsOfTasks\\OptionalTaskResult.java";
        String contents = readUsingFiles(fileName);
        contents = contents.replaceAll("public","private");
        System.out.print(contents);
        PrintWriter writerResult = new PrintWriter(result);
        writerResult.print(contents);
        writerResult.close();
    }

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)))  ;
    }

}
