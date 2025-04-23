import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;

class CopyFile {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        try {
            // Prompt user for source and destination file names
            System.out.print("Provide source file name: ");
            String sfile = sc.next();
            System.out.print("Provide destination file name: ");
            String dfile = sc.next();

            // Open the source file for reading
            FileReader fin = new FileReader(sfile);

            // Open the destination file for writing (in append mode)
            FileWriter fout = new FileWriter(dfile, true); // 'true' means append mode

            int c;
            // Read each character from the source file and write it to the destination file
            while ((c = fin.read()) != -1) {
                fout.write(c);
            }

            // Print a message once the copy is finished
            System.out.println("Copy finished...");

            // Close the file streams
            fin.close();
            fout.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: The source file was not found. Please check the file name or path.");
        } catch (IOException e) {
            System.out.println("Error: An I/O error occurred.");
        }
    }
}



