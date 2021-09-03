/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Nicholas Smarsh
 */

package org.example;
import java.util.Scanner;

public class assignment3 {

    public static void main( String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("who said the quote?");

        String theQuoter = scan.nextLine();

        System.out.println("What is the quote?");

        String theQuote = scan.nextLine();

        System.out.println( theQuoter + " said " + theQuote);
    }

}
