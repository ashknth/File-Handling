package Fileread;

import java.io.*;
import java.util.Scanner;

/**
 * Created by ashoknath on 6/28/19.
 */

    public class writer {


        public void writing() {
            try {
                //Whatever the file path is.
                File statText = new File("/Users/ashoknath/Desktop/Files/Data.txt");
                FileOutputStream is = new FileOutputStream(statText);
                OutputStreamWriter osw = new OutputStreamWriter(is);
                Writer w = new BufferedWriter(osw);
                w.write("POTATO!!!");

                w.close();
            } catch (IOException e) {
                System.err.println("Problem writing to the file statsTest.txt");
            }
        }


        public static void main(String[]args) {
            writer write = new writer();
            write.writing();
        }
    }

