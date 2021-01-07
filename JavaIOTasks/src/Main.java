import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dirCount = 0;
        int fileCount = 0;
        int averageFileCount = 0;
        int averageLengthFile = 0;
        try {
            File dir = new File(scan.nextLine());

                if (dir.exists() && dir.isDirectory()) {
                    System.out.println(dir.getName());
                    for (File current : dir.listFiles()) {
                        if (current.isDirectory()) {
                            dirCount++;
                            System.out.println("|----" + current.getName());
                            for (File currentIn : current.listFiles()) {
                                System.out.println("|    " + currentIn.getName());
                            }
                        } else if (current.isFile()) {
                            fileCount++;
                            System.out.println("|----" + current.getName());
                        }
                    }
                } else if (dir.exists() && dir.isFile()) {
                    fileCount++;
                    FileReader reader = new FileReader(dir.getPath());
                    Scanner scanner = new Scanner(reader);
                    while (scanner.hasNextLine()) {
                        System.out.println(scanner.nextLine());
                    }

                }

            }
        catch(Exception ex){
                System.out.println(ex.getMessage());
            }

    }
    private static String readUsingFiles(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)))  ;
    }


}
