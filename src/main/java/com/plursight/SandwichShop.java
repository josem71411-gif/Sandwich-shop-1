package com.plursight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 // Step 1: Asking for a size
 System.out.print("enter sandwich size (1= Regular, 2 = Large): ");
 int size = scanner.nextInt();

 double price = 0;
 double loadedPrice = 0;

 if (size == 1) {
     price = 5.45;
     loadedPrice = 1.00;
 } else if (size == 2) {
     price = 8.95;
     loadedPrice = 1.00;
 } else {
     System.out.println(("invalid Size Selected."));
     return;
 }

 // Step 1.5: asking if they want it Loaded
        scanner.nextLine();
        System.out.print("Would you like the sandwich loaded? (yes/no):  ");
        String isLoaded = scanner.nextLine();

        if (isLoaded.equalsIgnoreCase("yes")){
            price += loadedPrice;
        }

 // Step 2: Asking for age
        System.out.print("Enter your age:  ");
        int age = scanner.nextInt();
// Step 3: Apply Discount
        if (age <=17) {
            price = price * 0.90; // this is 10%
        } else if (age>= 65) {
            price = price * 0.80; // this is 20%
        }
// step 4: Displaying results
        System.out.printf("Your sandiwch costs: $%.2f\n", price);

        scanner.close();
    }

}
