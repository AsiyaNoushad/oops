import java.util.*; 
import java.io.*; 

public class EmployeeFileIO { 
    public static void main(String[] args) { 
        try { 
            Scanner obj = new Scanner(System.in); 
            FileOutputStream fout = new FileOutputStream("employee2.txt"); 
            int empno; 
            String empname; 
            int salary; 

            System.out.println("Enter the number of employees:"); 
            int limit = obj.nextInt(); 
            obj.nextLine(); // Consume newline

            for (int j = 0; j < limit; j++) { 
                try { 
                    System.out.println("Enter the employee number:"); 
                    empno = obj.nextInt(); 
                    obj.nextLine(); 

                    System.out.println("Enter the employee name:"); 
                    empname = obj.nextLine(); 

                    System.out.println("Enter the employee salary:"); 
                    salary = obj.nextInt(); 
                    obj.nextLine(); 

                    fout.write((empno + "\r\n").getBytes());
                    fout.write((empname + "\r\n").getBytes());
                    fout.write((salary + "\r\n").getBytes());

                } catch (InputMismatchException e) { 
                    System.out.println("Invalid input. Please enter valid data."); 
                    obj.nextLine(); // clear invalid input
                    j--; // retry this employee
                } 
            } 
            fout.close(); 
        } catch (Exception e) { 
            System.out.println("Error during writing: " + e); 
        }

        // File Reading Block
        try { 
            FileInputStream fin = new FileInputStream("employee2.txt");
            System.out.println("\nContents of the file:"); 
            int data; 
            while ((data = fin.read()) != -1) { 
                System.out.print((char) data); 
            } 
            fin.close(); 
        } catch (Exception e) { 
            System.out.println("Error during reading: " + e); 
        } 
    } // <- this closes main
}     // <- this closes the class
 






