package com.plursight;
import java.util.Scanner;
public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 // Step 1: Asking for a size
 System.out.print("enter sandwich size (1= Regular, 2 = Large): ");
 int size = scanner.nextInt();

 double price = 0;

 if (size == 1) {
     price = 5.45;
 } else if (size == 2) {
     price = 8.95;
 } else {
     System.out.println(("invalid Size Selected."));
     return;
 }
 // Step 2: Asking for age
        System.out.print("Enter your age:  ");
        int age = scanner.nextInt();
// Step 3: Apply Discount


    }

}
