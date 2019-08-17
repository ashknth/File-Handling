package handlefile;

import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Created by ashoknath on 8/17/19.
 */
public class SimpleFile {
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner(System.in);
        try
        {

            FileOutputStream fos= new FileOutputStream("File1.txt") ;
            System.out.println("Enter any string::");
            String str=scanner.next();
            byte s[]=str.getBytes();
            fos.write(s);
            System.out.println("File write successful.");

        }catch(Exception e){
            System.err.print("The file cannot be created.");

        }
    }
}
