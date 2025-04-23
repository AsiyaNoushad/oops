import java.io.*; 
import java.util.Scanner;

public class EvenOddNumbers { 
    public static void main(String[] args) { 
        try { 
            // Create a scanner for reading user input
            Scanner inputScanner = new Scanner(System.in); 
            System.out.print("Enter the name of the input file: "); 
            String inputFileName = inputScanner.nextLine(); 

            // Open the input file for reading
            FileInputStream inputFile = new FileInputStream(inputFileName); 
            Scanner fileScanner = new Scanner(inputFile); 

            // Create output streams for even and odd numbers
            FileOutputStream evenFile = new FileOutputStream("even.txt"); 
            FileOutputStream oddFile = new FileOutputStream("odd.txt"); 

            // Create PrintWriter objects to write to the output files
            PrintWriter evenWriter = new PrintWriter(evenFile); 
            PrintWriter oddWriter = new PrintWriter(oddFile); 

            // Read integers from the input file and process them
            while (fileScanner.hasNextInt()) { 
                int number = fileScanner.nextInt(); 

                // Check if the number is even or odd
                if (number % 2 == 0) { 
                    evenWriter.println(number); // Write even numbers to the even file 
                } else { 
                    oddWriter.println(number);  // Write odd numbers to the odd file
                } 
            }

            // Close the output files and scanners
            evenWriter.close(); 
            oddWriter.close(); 
            fileScanner.close(); 
            inputFile.close(); 

            // Print a message indicating completion
            System.out.println("Even and odd numbers have been copied to separate files."); 

        } catch (IOException e) { 
            // Catch any I/O errors and print the error message
            System.err.println("Error: " + e.getMessage()); 
        } 
    } 
}
