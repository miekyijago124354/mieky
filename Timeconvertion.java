import java.util.Scanner;
public class Timeconvertion 
{

    public static void main(String[] args) 
    {
        Scanner w = new Scanner (System.in);
        
          // execise1
        long seconds, minutes, hours, remainingseconds, remainingminutes;
        
        System.out.println("Enter the Time in Seconds: ");
        seconds=w.nextLong();
         
        minutes= seconds/ 60;
        hours=  seconds/ 3600;
        remainingseconds = seconds%60;
        remainingminutes = minutes - (hours*60);
        
        System.out.println("Time " + hours + "hours" + remainingminutes + " minutes " + remainingseconds + "Seconds");
          // exercise 2
        float miles, milespergallon, pricepergallon,cost; 
        System.out.println("Enter the driving distance: ");
        miles= w.nextFloat();
        System.out.println("Enter miles per gallon: ");
        milespergallon = w.nextFloat();
        System.out.println("Enter price per gallon: ");
        pricepergallon = w.nextFloat();
        
        cost = (miles/milespergallon)*pricepergallon;
        System.out.printf("The cost of driving is $%.2f", cost);
        System.out.println("");
              
    }
    
}
