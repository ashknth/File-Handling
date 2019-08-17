public class SimpleFile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {

            FileInputStream fin = new FileInputStream("File1.txt");
            FileOutputStream fout= new FileOutputStream("File2.txt");
            int ch;
            while ((ch=fin.read())!= -1)
            {
                fout.write(ch);

            }
            System.out.println("File copying successful");
            fin.close();
            fout.close();
        }catch(Exception ex){
                System.err.print("The file cannot be created.");

            }
        }
    }
