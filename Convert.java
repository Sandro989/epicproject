/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convert;

import java.util.Scanner;

/**
 *
 * @author Sandro
 */
public class Convert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner converter = new Scanner(System.in);
      
      
    double cm, m, celsius, miles;
    double inch = 0.393700787;
    double feet = 3.2808399;
    double fahrenheit = 33.8;
    double kilometers = 1.62137;
    int choice = 0;
    
    while (choice==0){  //   menu to come back after a choice except for sixth choice
    System.out.println("1. cm to inch ");
    System.out.println("2. m to feet");
    System.out.println("3. celsius to fahrenheit");
    System.out.println("4. cm to feet");
    System.out.println("5. miles to kilometers");
    System.out.println("6. Exit");
    choice = converter.nextInt();  //choose one of six options
    
    if (choice>6){ // greater than 3 wont work
        System.out.println("Invalid entry  "); // can only choose from 6 options
        choice=0;
    }

    else if (choice ==1){ //choice 1 to convert cm to inch
    System.out.println("Enter cm ");
    cm=converter.nextDouble(); 
    
    System.out.println("That is " +(inch*cm)+ "inches" ); //upon users input my formula for cm to inch  
    choice=choice-1; // loop to bring back my menu
    }
           
    
    else if (choice==2) {
        System.out.println("Enter meter ");
        m=converter.nextDouble();
        
    System.out.println("That is " +(feet*m)+ "feet");
    choice=choice-2;
    }
    
    else if (choice==3) {
        System.out.println("Enter celsius ");
        celsius=converter.nextDouble();
        
    System.out.println("That is " +(2*celsius+30)+ "fahrenheit");//F = (C x 2) + 30
    choice=choice-3;
    }
    
    else if (choice==4) {
        System.out.println("Enter cm ");
        cm=converter.nextDouble();
        
    System.out.println("That is" +(feet*cm)+ "feet ");
    choice=choice-4;
    }
    
    else if (choice==5) {
        System.out.println("Enter mile ");
        miles=converter.nextDouble();
        
    System.out.println("That is" +(kilometers*miles)+ "kilometers ");
    choice=choice-5;
    }
    
    if (choice==6) {
     System.out.println("EXIT"); 
     System.exit(0); //exit strategy
    }
    }
    }
    
}
