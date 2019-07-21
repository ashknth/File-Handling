package Fileread;


import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

/**
 * Created by ashoknath on 7/14/19.
 */
public class FileWriter {



    public static void main(String[] args) {
        String name;
        int roll;
        float grade;
        Scanner scanner= new Scanner(System.in);


for(int i=0;i<=2;i++) {
    System.out.println("Enter Name:");
    name = scanner.next();
    System.out.println("Enter roll no:");
    roll = scanner.nextInt();
    System.out.println("Enter your grade:");
    grade = scanner.nextFloat();


    try {

        FileOutputStream out = new FileOutputStream("/Users/ashoknath/Desktop/Files/Student.txt");
        DataOutputStream d = new DataOutputStream(out);
        d.writeUTF(name);
        d.writeInt(roll);
        d.writeFloat(grade);

        d.flush();
        out.close();


    } catch (Exception e) {


        System.out.println("Error in writing");


    }
}

    }
}