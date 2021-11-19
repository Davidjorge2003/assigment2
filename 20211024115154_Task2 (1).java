/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author davic
 */
public class Task4 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner myScanner= new Scanner(System.in);
        System.out.println("how many numbers?");
       int num=myScanner.nextInt();
        System.out.printf("Result: %.2f\n", genAvg(num));
    }   
        
        
        
        public static double genAvg(int num) {
            Random rand = new Random(); //instance of random class
            
     double sum=0;
      int n=0;        
      //int number = 100; // //generate random values from 0-100
      
        for (int i = 0; i < num; i++) {
        int randomnum = rand.nextInt(100);
               System.out.println("the random numbers is:"+randomnum);                            
         if (randomnum>40) {
           sum +=randomnum;  
           n++;
         } 
        }
        return sum/n;
        
    }
       
    }   
        

        

        
    

