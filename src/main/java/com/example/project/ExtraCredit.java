package com.example.project;
import java.util.Scanner;


public class ExtraCredit {
    public static double roundToPlaces(double number, int places) {
        double multiplyFactor = Math.pow(10, places);
        return (int) (number * multiplyFactor + 0.5) / multiplyFactor;
    }
    public static double roundDownToPlaces(double number, int places) {
        double multiplyFactor = Math.pow(10, places);
        return (int) (number * multiplyFactor) / multiplyFactor;
    }
    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

                //COPY AND PASTE YOUR CODE HERE 
        double tip = (int) (cost * percent + 0.5) / 100.0;
        double totalCost = cost + tip;
        double perPersonCost = roundToPlaces(cost / people, 2);
        double perPersonTip = roundToPlaces(tip / people, 2);
        double perPersonTotal = roundDownToPlaces(totalCost / people, 2);
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + "$" + cost + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + "$" + tip + "\n");
        result.append("Total Bill with tip: " + "$" + totalCost + "\n");
        result.append("Per person cost before tip: " + "$" + perPersonCost + "\n");
        result.append("Tip per person: " + "$" + perPersonTip + "\n");
        result.append("Total cost per person: " + "$" + perPersonTotal + "\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        String items = "";

        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        while (!userInput.contains("-1")) {
            System.out.print("Please enter an item name or type \"-1\" to finish:\n> ");
            userInput = scanner.nextLine();
            if (!userInput.contains("-1")) {
                items += userInput + "\n";
            }
        }
        scanner.close();

        //Your scanner object and while loop should go here
                             
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
