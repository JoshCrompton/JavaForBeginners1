package userinput;

import java.util.Scanner;

public class UserInput {


    public static void main(String[] args) {
        System.out.println("Please enter the following information:");
        System.out.println("Name:");
        Scanner sc1 = new Scanner(System.in);
        String answer1 = sc1.nextLine();
        System.out.println("Year:");
        Scanner sc2 = new Scanner(System.in);
        String answer2 = sc2.nextLine();
        System.out.println("Pathway:");
        Scanner sc3 = new Scanner(System.in);
        String answer3 = sc3.nextLine();
        System.out.println("Previous Grade:");
        Scanner sc4 = new Scanner(System.in);
        String answer4 = sc4.nextLine();
        System.out.println("Your name is " + answer1);
        System.out.println("You are in year " + answer2);
        System.out.println("Your pathway is " + answer3);
        System.out.println("Your previous grade was " + answer4);
    }
    
}
