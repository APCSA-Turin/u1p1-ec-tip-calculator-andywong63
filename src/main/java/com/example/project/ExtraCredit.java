package com.example.project;
import java.util.Scanner;


public class ExtraCredit {
    public static String roundMoney(double number) {
        return "$" + String.format("%.2f", number); // https://stackoverflow.com/a/27832159
    }
    public static String roundMoneyDown(double number) {
        number = (int) (number * 100) / 100.0;
        return "$" + String.format("%.2f", number); // https://stackoverflow.com/a/27832159
    }
    public static String calculateTip(int people, int percent, double cost, String items) {
        StringBuilder result = new StringBuilder();

        //COPY AND PASTE YOUR CODE HERE 
        double tip = (int) (cost * percent + 0.5) / 100.0;
        double totalCost = cost + tip;

        String costRounded = roundMoney(cost);
        String tipRounded = roundMoney(tip);
        String perPersonCost = roundMoney(cost / people);
        String perPersonTip = roundMoney(tip / people);
        String perPersonTotal = roundMoneyDown(totalCost / people);
        String totalCostRounded = roundMoney(totalCost);
                       
        result.append("-------------------------------\n");
        result.append("Total bill before tip: " + costRounded + "\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: " + percent + "%\n");
        result.append("Total tip: " + tipRounded + "\n");
        result.append("Total Bill with tip: " + totalCostRounded + "\n");
        result.append("Per person cost before tip: " + perPersonCost + "\n");
        result.append("Tip per person: " + perPersonTip + "\n");
        result.append("Total cost per person: " + perPersonTotal + "\n");
        result.append("-------------------------------\n");

        //the two lines  should go below result.append("-------------------------------\n"); 
        result.append("Items ordered:\n");
        result.append(items);


        return result.toString();
    }
                                   
    public static void main(String[] args) {
        int people = 10;
        int percent = 10;
        double cost = 100;
        String items = "";

        System.out.println(roundMoney(1.495));

        //Your scanner object and while loop should go here
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
                             
        System.out.println(calculateTip(people,percent,cost,items));
    }
}
