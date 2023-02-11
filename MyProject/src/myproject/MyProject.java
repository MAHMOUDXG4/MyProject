
package myproject;

import java.util.Scanner;

public class MyProject {

    public static void main(String[] args) {
        //using scanner class for the inputs
        Scanner keyboard = new Scanner(System.in);
        Helper h = new Helper();
        
        //calling the helper class that we put on it every single method in the program
        Helper.displayMenu();
        //making loop run depends on the user answer 
        System.out.println("Do you want to continue ?");
        String costumerAnswer = keyboard.nextLine();
        //if the user said yes the program will continue running
        while(costumerAnswer.equals("yes") || costumerAnswer.equals("YES")) {
                Helper.displayMenu();
                System.out.println("Do you want to continue ?");
                costumerAnswer = keyboard.nextLine(); 
                //until the user says no the program will stop
                if(costumerAnswer.equals("no") || costumerAnswer.equals("NO")) {
                    break;
                }
            }


    }
    
}
