/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Avery Reyna
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main(String[] args)
    {
        // this input asks the user for their age
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age? ");
        int age = Integer.parseInt(input.nextLine());

        // put the ternary operator in the output statement
        System.out.println(age >=16? "You are old enough to legally drive." :"You are not old enough to legally drive.");
    }
}
