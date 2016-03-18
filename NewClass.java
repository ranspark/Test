/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        
        int age;
        int feet;
        int inches;
        double weight;
                
        System.out.println("what's Your Age?");
        age=input.nextInt();
        
        System.out.println("Whats your height in feet only");
        feet=input.nextInt();
        
        System.out.println("Now we got the feet,how many inches tall are you?");
        inches=input.nextInt();
        
        System.out.println("Whats much do you weigh?");
        weight=input.nextDouble();
        
        System.out.println("So you are "+ age + "years old"+feet+" '"+inches+" "+"tall"+"And weigh"+weight);
        
    }
            
            
            
            
}
