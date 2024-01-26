package App;

import java.util.Scanner;
import client.addition;
import client.multiplication;

public class demo
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter 1 for addition, 2 for multiplication");
        String choice = "";
        boolean userInput = false;
        
        while (!userInput) {
            try {
                choice = kb.nextLine();
                if (choice.equals("1")){
                    addition myAddition = new addition();
                    System.out.println(myAddition.calculationMethod());
                }
                else if(choice.equals("2")){
                    multiplication myMultiplication = new multiplication();
                   System.out.println(myMultiplication.calculationMethod());
                }else {
                    System.out.println("Bad input, try again");
                } 
            } catch(Exception e){
                System.out.println("Error" + e.getMessage());
            }
        }


        kb.close();
    }
}