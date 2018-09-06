/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentdatabase;

import java.util.Scanner;

/**
 *
 * @author sabos
 */
public class StudentDatabase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creating and initialising Student object
        Student s = new Student();
        
        //Token for controlling loop
        int token =1;
        do{
        System.out.println("1 - Student Information\n2 - Enroll Course\n3 - Print Bill\n Q to Close Program");
        System.out.print("Enter a key :");
        Scanner jin = new Scanner(System.in);
        String n = jin.nextLine();
        String enter;
        switch(n){
            case "1":
                if(!(n.equals("q"))||!(n.equals("q"))){
                    s.studentInfromation();
                    System.out.print("Enter e to continue: ");
                    enter = jin.nextLine();
                    System.out.print("\n\n\n");
                }
                break;
            case "2":
                if(!(n.equals("q"))||!(n.equals("q"))){
                    s.enroll();
                    System.out.print("Enter e to continue: ");
                    enter = jin.nextLine();
                    System.out.print("\n\n\n");
                }
                break;
            case "3":
                if(!(n.equals("q"))||!(n.equals("q"))){
                    s.printBill();
                    System.out.print("Enter e to continue: ");
                    enter = jin.nextLine();
                    System.out.print("\n\n\n");
                }
                break;
            case "q":
                token=0;
                break;
            case "Q":
                token=0;
                break;
            default:
                System.out.println("Invalid Input");
                
        }
        }while(token!=0);
        
    }
    
}
