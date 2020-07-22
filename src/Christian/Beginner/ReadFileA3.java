package Christian.Beginner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class ReadFileA3 {
    public static void main(String[] args) {
        try {
            File file1 = new File("C:\\Users\\jimmy\\IdeaProjects\\Java.W4D3.Sander.Pichler\\src\\Christian\\Beginner\\readme.txt"); // Create file object
            Scanner scanner = new Scanner(file1); // Create new scanner object
            while (scanner.hasNext()) { // While condition
                String output = scanner.next(); // Save lines read
                String []formatOutput = output.split(" ");
                for(int i = 0; i < formatOutput.length; i++){

                    System.out.print(Arrays.toString(formatOutput) +" ");
                    if (formatOutput[i].contains(":")){
                        System.out.println("\n");
                    }if (formatOutput[i].contains("egg")){
                        System.out.println("\n");
                    }

                }
                 // Output lines read
            }
            scanner.close(); // Close the scanner
        } catch (FileNotFoundException e) { // Catch the exception
            System.out.println("Error occurred");
            e.printStackTrace();
        }

    }
}
