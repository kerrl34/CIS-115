/**
 * Liam Kerr
 * 10-1-24
 * 
 * M4Widget_Kerr
 * This program will calculate the total sales
 */
// import the utility for input
import java.util.Scanner;
 public class M4Widget_Kerr
 {

    public static void main(String[] args) 
    {
        // variable declarations
        int quarter1, quarter2, quarter3, quarter4, annual_widgets;
        double salesTax, salesAmount, total;
        final double TAX = .07, PRICE = 4.79; // constants in java use the final reserved word
        // declare scanner variable for input
        Scanner keyboard = new Scanner(System.in);

        // input for the user to see and respond to
        System.out.print("Enter sales for quarter one: ");
        quarter1 = keyboard.nextInt(); 
        System.out.print("Enter sales for quarter two: ");
        quarter2 = keyboard.nextInt(); 
        System.out.print("Enter sales for quarter three: ");
        quarter3 = keyboard.nextInt(); 
        System.out.print("Enter sales for quarter four: ");
        quarter4 = keyboard.nextInt(); 
        
        //calculations
        annual_widgets = quarter1 + quarter2 + quarter3 + quarter4;
        salesAmount = annual_widgets * PRICE;
        salesTax = salesAmount * TAX;
        total = salesAmount + salesTax;

        // output
        
        System.out.println("Annual Widgets Sold: " + annual_widgets);
        System.out.println("Widget Sales Amount: " + salesAmount);
        System.out.println("Sales Tax Collected: " + salesTax);
        System.out.println("Total Amount: " + total);
        
        
        keyboard.close();
        //System.out.println(quarter1);
        //System.out.println("Widgets");
    }
}