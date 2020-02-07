/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 0781317
 */
import java.util.Scanner;
public class taxCalculator {
    public static void main(String[] args) {
     
    //prompt user to input the cost before tax
    System.out.println("Please input the cost of your purchase.");
    Scanner keyboard = new Scanner(System.in);
        double totalBeforeTax = keyboard.nextDouble();
        
    //find the total state tax
    double stateTax = totalBeforeTax*.04;
    //display the state tax
         System.out.println("State Tax: $" + stateTax);
         
    //find the total county tax
    double countyTax = totalBeforeTax*.02;
    //display the county tax
         System.out.println("County Tax: $" + countyTax);
    //calculate the total sales tax
    
    double totalSalesTax = stateTax+countyTax;
    //display the total sales tax
         System.out.println("Total Tax: $" + totalSalesTax);
    //calculate the total price with tax
    
    double finalTotal = totalBeforeTax+totalSalesTax;
    //display the total price
         System.out.println("Final Total: $" + finalTotal);
    }

    
}
