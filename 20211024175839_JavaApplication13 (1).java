/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

import java.util.Scanner;

/**
 *
 * @author davic
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner myScanner= new Scanner(System.in);
        System.out.println("how many year have you work?");
        int year=myScanner.nextInt();
        System.out.println("what is your initial salary?");
        int salary=myScanner.nextInt();
        System.out.printf("%2.2f" ,calc( salary, year));
    }
      public static double calc(int salary, int year){
        double currentsalary=salary;
        int calcyear=1;
        
         while(calcyear <= year){
             if (calcyear < 3) {
                 currentsalary=currentsalary+(currentsalary*0.03);
                 calcyear=calcyear+1;
                 
             }else if((calcyear >= 3) && (calcyear <= 9)){
                 currentsalary=currentsalary+(currentsalary*0.05);
                 calcyear=calcyear+1;
         }else if(calcyear >= 10){
             currentsalary=currentsalary+(currentsalary*0.08);
             calcyear=calcyear+1;
         }
            
    }
          
         return currentsalary;
      }
    
}
