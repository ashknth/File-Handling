package Fileread;

import java.io.*;

/**
 * Created by ashoknath on 7/10/19.
 */
public class FileReader {



    public static void main(String[] args) {


        try {
            FileInputStream in = new FileInputStream("/Users/ashoknath/Desktop/Files/Employee.txt"); //location of file j rakhda ni hunxa
            DataInputStream d1 = new DataInputStream(in);


            String s = d1.readUTF();
            int r = d1.readInt();
            float g = d1.readFloat();
            if (g > 0) {
                System.out.println("Name:" +s);
                System.out.println("Rollno:" +r);
                System.out.println("Grade:" +g);

            }


        } catch (Exception e) {
            System.out.println("Error in reading");

        }
    }
}

