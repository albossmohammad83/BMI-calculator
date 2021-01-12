/*
 * Lab 2
 * Description: store the user information and display the user BMI and age in different formats
 * Name: Mohammad Abdelrahman
 * ID: 920158652
 * Class: CSC 211-02
 * Semester: fall 2020
 */
import java.util.Scanner;
public class OverCalculator {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in); // creat an objet input to store the user input
        System.out.println("Enter your full name"); // prompt the user to enter their name
        String Name = input.nextLine(); //store the user name input
        System.out.println("Enter your age in years"); // prompt the user to enter their age
        int Age = input.nextInt(); //store the user name input
        System.out.println("Enter your height in meters"); // prompt the user to enter their height
        double Height = input.nextDouble(); //store the user height input
        System.out.println("enter your weight in pounds"); // prompt the user to enter their weight
        int Weight = input.nextInt(); //store the user weight input
        Name = Name.toUpperCase(); // change the user name to all capital letters
        System.out.println("Name: " + Name); // print the user name in all capital letters
        int months = Age * 12; // age in months
        int weeks =  Age * 52; // age in weeks
        int days = weeks * 7; // age in days
        int hours = days * 24; // age in hours
        long minutes = hours * 60; // age in minutes
        long seconds = minutes * 60; // age in seconds
        System.out.println("You are "+ months +" months old"); // print age in months
        System.out.println("You are "+ weeks +" weeks old"); // print age in weeks
        System.out.println("You are "+ days +" days old"); // print age in days
        System.out.println("You are "+ hours +" hours old"); // print age in hours
        System.out.println("You are "+ minutes +" minutes old"); // print age in minutes
        System.out.println("You are "+ seconds +" seconds old"); // print age in seconds
        double BMI = Weight / ( Math.pow(Height,2) ); // calculate the BMI of the user
        System.out.println("Your BMI is " + BMI); // print the user BMI
        System.out.println("Your BMI (Casted to int) is " + (int) BMI); // printing the user BMI as an integer
    }
}
