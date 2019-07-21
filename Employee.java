package File;

        import java.io.*;


/**
 * Created by ashoknath on 7/16/19.
 */
public class Employee {

    public static void main(String[] args) {
        String line=null;

        try {

            FileReader fr = new FileReader("/Users/ashoknath/Desktop/Files/Employee.txt");

            int i;
            while ((i=fr.read()) != -1)
                System.out.print((char) i);
        } catch (Exception e){
            System.out.println("Error in reading file!!");
        }

    }
}



