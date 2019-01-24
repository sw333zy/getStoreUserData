package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //get scanner utility to be able to receive user input from terminal
        Scanner scan = new Scanner(System.in);
        //asks for information to be entered into terminal
        System.out.println("Enter first initial");
        //gets information entered into terminal
        String firstInitial = scan.next();
        System.out.println("Enter last name");
        String lastName = scan.next();
        System.out.println("Enter house number");
        String houseNumber = scan.next();
        System.out.println("Enter street name");
        String streetName = scan.next();
        System.out.println("Enter street type");
        String streetType = scan.next();
        System.out.println("Enter city");
        String city = scan.next();
        //Prints out information entered
        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
     }
}
