/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Karlinski
 */


package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final String USERNAME = "foo";
        final String PASSWORD = "abc$123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the Username? ");
        String usernameInput = scanner.nextLine();

        System.out.print("What is the Password? ");
        String passwordInput = scanner.nextLine();

        if(passwordInput.equals(PASSWORD) && usernameInput.equalsIgnoreCase(USERNAME))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }
    }
}
