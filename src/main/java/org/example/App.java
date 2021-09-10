package org.example;


import java.util.Scanner;

import static java.lang.System.out;

/**
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ivan pavlov
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args){

    //App math = new App();
    App ask = new App();
    double amount = ask.amount();
    double tax = ask.state();
        out.println(String.format("The subtotal is $%.2f ",amount));
        out.println(String.format("The tax is $%.2f ",(double)Math.round(amount*tax*100)/100));
        out.println(String.format("The total is $%.2f ",((amount*tax)+amount)));


    }
     private int amount(){
        out.print("What is the order amount? ");
        return in.nextInt();
     }
    private double state(){
        double tax = .055;
        String str1 = "WI";
        out.print("What is the state? ");
        String str = (in.next());
      //  out.println(str);
        if(str1.equals(str)) return tax;
        return 0;
    }
}
