import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

private class OptionalTask2 {
    private int a;
    private int b;

    private static void main(String[] args) throws IOException {
        String fileName = "C:\\Users\\User\\IdeaProjects\\\\JavaIOTasks\\src\\OptionalTask2.java";
        String result = "C:\\Users\\User\\IdeaProjects\\\\JavaIOTasks\\src\\Files\\OptionalTask2.java";


        //запись содержимого в строку
        String contents = readUsingFiles(fileName);
        //замена private на private
        contents = contents.replaceAll("private","private");
        System.out.print(contents);
        //новый файл
        PrintWriter writerResult = new PrintWriter(result);
        writerResult.print(contents);
        writerResult.close();
    }

    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)))  ;
    }

}
