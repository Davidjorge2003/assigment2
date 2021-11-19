/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2task1;

import java.util.Scanner;

/**
 *
 * @author davic
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myScanner= new Scanner(System.in);
  
  int numMonth, year;
  int numDays = 0;
  //String month= "Not exist";
  
  System.out.println("What is the number of the month ?");
  numMonth = myScanner.nextInt();
  
  System.out.println("Enter the year");
  year = myScanner.nextInt();
        System.out.println(ifelsemethotd( year, numMonth,  numDays));
       
    }
    
    public static int ifelsemethotd(int year,int numMonth, int numDays){
        
        if (numMonth==1) {
            System.out.println("January");
            System.out.println("31 days");
        }
            if(numMonth==2&&((year%400==0)||((year%4==0)&&(year%100!=0)))){                
                    System.out.println("February");
                  System.out.println("29 days");
            }
            else if(numMonth==2&&((year%400!=0)||((year%4!=0)&&(year%100!=0)))){
                System.out.println("February");
                System.out.println("28 days");
            }
             if (numMonth==3) {
               System.out.println("March");
            System.out.println("31 days"); 
            }
            else if (numMonth==4) {
               System.out.println("April");
            System.out.println("30 days"); 
            } 
            else if (numMonth==5) {
               System.out.println("May");
            System.out.println("31 days"); 
            }
            else  if (numMonth==6) {
               System.out.println("Jun");
            System.out.println("30 days"); 
            }
              else if (numMonth==7) {
               System.out.println("July");
            System.out.println("31 days"); 
            }
              else  if (numMonth==8) {
               System.out.println("Agust");
            System.out.println("31 days"); 
            }
               else  if (numMonth==9) {
               System.out.println("September");
            System.out.println("30 days"); 
            }
                else  if (numMonth==10) {
               System.out.println("October");
            System.out.println("31 days"); 
            }
                else   if (numMonth==11) {
               System.out.println("November");
            System.out.println("30 days"); 
            }
                  else  if (numMonth==12) {
               System.out.println("December");
            System.out.println("31 days"); 
            }
        return year ;
                    
        }
        
}
  /*public static void siwichmethotd(int year,int numMonth, int numDays){
  switch(numMonth) {
  case 1:
   month = "January";
   numDays = 31;
   break;
   
        case 2:
            month = "February";
            if ((year%400==0) || ((year%4==0)&&(year%100!=0))) {
             numDays = 29;
            } else {
             numDays = 28;
            }
            break;
        case 3:
            month = "March";
            numDays = 31;
            break;
        case 4:
            month = "April";
            numDays = 30;
            break;
        case 5:
            month = "May";
            numDays = 31;
            break;
        case 6:
            month = "June";
            numDays = 30;
            break;
        case 7:
            month = "July";
            numDays = 31;
            break;
        case 8:
            month = "August";
            numDays = 31;
            break;
        case 9:
            month = "September";
            numDays = 30;
            break;
        case 10:
            month = "October";
            numDays = 31;
            break;
        case 11:
            month = "November";
            numDays = 30;
            break;
        case 12:
            month = "December";
            numDays = 31;*/
  
  
 /* System.out.println("The month of " + month + " " + year + "has " 
  + numDays +"days");*/

    
