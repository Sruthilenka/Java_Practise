package ExceptionsDemo;
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void demo() {
      //  FileReader reader = new FileReader("file.txt"); // have to handle this exception(chcked) coz that file doesnt exist.
        try {
          File file = new File("path/to/something");
          Scanner sc = new Scanner(file);

        } catch(FileNotFoundException e) {
            System.out.println("File not found: "+e.getMessage()); // The message is already in FileNotFoundException Class
        }
    }

}
