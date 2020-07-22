package Christian.Beginner;

import java.io.File;

public class CreateFileA1 {

    public static void main(String[] args) {


        try {
            File file = new File("C:\\Users\\jimmy\\IdeaProjects\\Java.W4D3.Sander.Pichler\\src\\Christian\\Beginner\\file.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
        System.out.println(System.getProperty("user.dir"));
    }
}
