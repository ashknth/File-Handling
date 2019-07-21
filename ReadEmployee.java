package File;

        import java.io.DataInputStream;
        import java.io.FileInputStream;

/**
 * Created by ashoknath on 7/17/19.
 */
public class ReadEmployee {
    public static void main(String[] args) {
        try
        {

            byte[] buffer = new byte[72];
            FileInputStream fin= new FileInputStream("/Users/ashoknath/Desktop/Files/Employee.txt");
            DataInputStream d=new DataInputStream(fin);
            int total = 0;
            int nRead = 0;
            while((nRead = fin.read(buffer)) != -1) {
                // Convert to String so we can display it.
                // Of course you wouldn't want to do this with
                // a 'real' binary file.
                System.out.println(new String(buffer));
                total += nRead;
            }

        }catch(Exception e){
            System.out.println("Error");

        }
    }
}
