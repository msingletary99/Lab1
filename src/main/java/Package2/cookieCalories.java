/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;

import java.util.Scanner;

/**
 *
 * @author 0781317
 */
public class cookieCalories {
    public static void main(String[] args) {
        //prompt user to imput number of cookies consumed
        System.out.println("How many cookies did you eat?");
            Scanner keyboard = new Scanner(System.in);
            int cookiesEaten = keyboard.nextInt();
        //calculate the calories per cooke and set it to a variable
             //40 cookies = 10 servings
             //4 cookies per serving, each sercing 300 cal
             // 300/4=75
             // 75 calories per cookie
            int caloriePerCookie = 75;
        //calculate the number of calories consumed by user
        int totalCalories = cookiesEaten*caloriePerCookie;
        //display the total calories
        System.out.println("You have comsumed " + totalCalories + " calories in cookies!");
    }
}
