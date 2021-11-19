/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assg2task4;

import java.util.Scanner;

/**
 *
 * @author davic
 */
public class Assg2task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("what grade did you got?");
        int grade=myScanner.nextInt();
        System.out.println(gradeCalc(grade));   
        //System.out.println(printMessage(char letterScore));
       char score =gradeCalc(grade);
        printMessage(score);
    }
        public static char gradeCalc(double grade){
            char grade1=0;
                if (grade <= 100 && grade >= 90) {
            grade1= 'a';
        } else if (grade < 90 && grade >= 80) {
            grade1= 'b';
        } else if (grade < 80 && grade >= 70) {
            grade1= 'c';
        } else if (grade < 70 && grade >= 60) {
            grade1= 'd';
        } else if (grade < 60) {
            grade1= 'f';
        }
        return grade1;
    }
        public static void printMessage (char letterScore){
            
        switch (letterScore) {
            case 'a':
                
                System.out.println("Excelent");
                break;
           case 'b':
                
                System.out.println("Well done");
                break;
            case 'd':
            case 'c':

                System.out.println("Passed");
               break;
            case 'f':
               
                System.out.println("Better try again");
                break;
            default:
                break;
                
           /*if (letterScore=='a') { 
               System.out.println("Excelent");
            }
            else if (letterScore=='b') {
                System.out.println("Well done");
               }
            else  if (letterScore=='d'||letterScore=='c') {
                System.out.println("Passed");
                }
            
            else if (letterScore=='f') {
                System.out.println("Better try again");*/
        }
            
    }
    
}
