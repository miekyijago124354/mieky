import java.util.Scanner;

public class Exercise 
{

    
    public static void main(String[] args)
    {
       Scanner a = new Scanner(System.in);
       String Employeename;
       float fedtax,statax,socsectax,medtax,penplan,healins,gross,total;
       final float federalincome= 0.15f,statetax= 0.035f,socialsecuritytax= 0.0575f,medicaretax= 0.0275f, pensionplan= 0.05f,healthinsurance= 75.00f;
       System.out.println("Enter employee name");
       Employeename =a.nextLine();
       System.out.println("enter Gross Amount");
       gross=a.nextFloat();
       
       
       fedtax = gross * federalincome;
       statax = gross * statetax;
       socsectax = gross * socialsecuritytax;
       medtax = gross * medicaretax;
       penplan = gross* pensionplan;
       total = gross - fedtax - statax - socsectax - medtax - penplan - healthinsurance;
       System.out.println(Employeename);
       System.out.printf("Gross Amount: %.2f", gross);
       System.out.printf("\nFederal Tax: %.2f", fedtax);
       System.out.printf("\nState Tax: %.2f", statax);
       System.out.printf("\nSocial Security Tax %.2f",socsectax);
       System.out.printf("\nMedicare Tax %.2f", medtax);
       System.out.printf("\nPension Plan %.2f",penplan); 
       System.out.printf("\nHealth Insurance; %.2f", healthinsurance);
       System.out.printf("\nNet Pay: %.2f", total);
       
       // running sums
       int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
       System.out.println("Enter number");
       n1=a.nextInt();
       n2=a.nextInt();
       n3=a.nextInt();
       n4=a.nextInt();
       n5=a.nextInt();
       n6=a.nextInt();
       n7=a.nextInt();
       n8=a.nextInt();
       n9=a.nextInt();
       n10=a.nextInt();
       
       r1=n1+n2;
       r2=r1+n3;
       r3=r2+n4;
       r4=r3+n5;
       r5=r4+n6;
       r6=r5+n7;
       r7=r6+n8;
       r8=r7+n9;
       r9=r8+n10;
       System.out.println(n1 + ","+ r1 + ","+ r2 + ","+ r3 + ","+ r4 + ","+ r5 + ","+ r6 + ","+ r7 + ","+ r8 + ","+ r9);
     
  
    }
    
}
