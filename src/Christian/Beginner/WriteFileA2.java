package Christian.Beginner;


import java.io.FileWriter;
import java.io.IOException;

public class WriteFileA2 {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("file.txt");
            file.write("Files in Java are fuuuuuuuuuunnn");
            file.close();
            System.out.println("Successfully wrote to file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}