import java.awt.*; 
import java.awt.event.*;

public class MaxNumber extends Frame { 
    private TextField num1Field, num2Field, num3Field, resultField; 
    private Button calculateButton; 

    public MaxNumber() {  
        setTitle("Maximum of Three Numbers"); 
        setSize(300, 200); 
        setLayout(new FlowLayout());  

        num1Field = new TextField(10); 
        num2Field = new TextField(10); 
        num3Field = new TextField(10);  
        resultField = new TextField(20); 
        resultField.setEditable(false); 
        calculateButton = new Button("Calculate Maximum"); 

        add(new Label("Enter three numbers: ")); 
        add(num1Field); 
        add(num2Field); 
        add(num3Field); 
        add(calculateButton); 
        add(new Label("Maximum: ")); 
        add(resultField); 

        // Button action listener
        calculateButton.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                calculateMaximum(); 
            } 
        }); 

        // Window closing listener
        addWindowListener(new WindowAdapter() { 
            public void windowClosing(WindowEvent e) { 
                System.exit(0); 
            } 
        }); 
    } 

    private void calculateMaximum() { 
        try { 
            // Parse the numbers from the text fields
            double num1 = Double.parseDouble(num1Field.getText()); 
            double num2 = Double.parseDouble(num2Field.getText()); 
            double num3 = Double.parseDouble(num3Field.getText()); 

            // Find the maximum of the three numbers
            double maximum = Math.max(Math.max(num1, num2), num3); 
            
            // Display the result in the result field
            resultField.setText(Double.toString(maximum)); 
        } catch (NumberFormatException ex) { 
            // Handle invalid input
            resultField.setText("Invalid input. Enter numbers."); 
        } 
    } 

    public static void main(String[] args) { 
        MaxNumber maxApp = new MaxNumber(); 
        maxApp.setVisible(true); 
    } 
}

