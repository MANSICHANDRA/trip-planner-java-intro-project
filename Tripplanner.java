
import java.util.*;
import java.util.Scanner;
public class Tripplanner {
	public static void main(String []args)
	{
		 greeting();
		travelTime();
		timeDifference();
		countryArea();
		//void round();
	
		
	}


     public static void greeting()
     {
    	 Scanner var =new Scanner (System.in);
    	 String name;
    	 String city;
    	 System.out.println("Welcome to Vacation Planner!");
    	 System.out.print("What is your name? ");
    	 name=var.nextLine();
    	 System.out.print("Nice to meet you "+name+", where are you tarvelling to? ");
    	 city=var.nextLine();
    	 System.out.println("Great! "+city+" sounds like a great trip");
    	 System.out.println("\n***********");
     }
     
     public static void travelTime()
     { Scanner var=new Scanner (System.in);
       int days;
       int money;
       String symbol;
       int doller;
       int cal;
       int hours;
       int min;
    
       
       
       
       System.out.print("\nHow many days are you going to spend travelling? "); 
       days=var.nextInt();
       System.out.print("How much money, in USD,are you planning to spend on your trip? ");
       money=var.nextInt();
       System.out.print("What is the three letter currency symbol for your travel destination? ");
       symbol=var.next();
       System.out.print("How many "+symbol+" are there in 1 USD? ");
       doller=var.nextInt();
       hours=days*24;
       min=hours*60;
       double con=(money/days);
       
       cal= (money*doller)/days;
       
       System.out.println("\n\nIf you are travelling for "+days+" days that is the same as "+hours+" hours or "+min+" minutes");
       System.out.println("If you are going to spend "+money+" USD that means per day you can spend up to "+con+" USD");
       System.out.println("Your total budget in "+symbol+" is "+doller*money+ symbol+", which per day is "+cal+ symbol);
       System.out.println("\n***********");
       
       }
      
       public static void timeDifference()
       {    
    	   Scanner var =new Scanner (System.in);
    	   int ta;
    	   int tb;
    	   int tc;
    	   System.out.print("\nWhat is the time diffrence, in hours, between your destination? ");
    	   int hours=var.nextInt();
           ta=hours%24;   
    	   tb=0+ta;
    	   tc=12+ta;
    	   System.out.println("That means that when it is midnight at home it will be "+tb+":00 in your travel destination");
    	   System.out.println("and when it is noon at home it will be "+tc+":00");
    	   

       }
       
       public static void countryArea()
       {
    	   Scanner var =new Scanner (System.in);
    	   int area;
    	   double miles;
    	   System.out.print("\n\nWhat is the square area of your destination country in Km2? ");
    	   area=var.nextInt();
    	   miles=area*0.38610;
    	   System.out.println("In miles2 that is "+miles);
    	   System.out.println("\n***********");
    	   
    	   
    	   
       }
}