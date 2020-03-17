import java.util.Scanner;
import java.util.Random;

class Mo
{
    public float Average()
    {
       Random Num1 = new Random();
       Scanner Obj1 = new Scanner(System.in);

       float Sum1,Sum2=0,Aver=0; //float numbers

       System.out.println("Give the number of Random() > 0");
       int x=Obj1.nextInt(); //system in ---> x
       System.out.println();

       if(x>0)
       {
            for(int i=0;i<x;i++)
            {
                Sum1=Num1.nextFloat(); // rand numbers
                if(Sum1>0)
                {
                    System.out.println("The number is: "+Sum1);
                    Sum2=Sum2+Sum1; //Sum all numbers
                    Aver=Sum2/10; //Average of numbers
                } //end if        
            } //end for
       } //end if
       else if(x<=0) //x<=0
       {
           System.out.println("No option");
       } //end else if

       System.out.println();
       System.out.println();
       System.out.println("The sum is: "+Sum2);
       System.out.println();
       System.out.println("The Average is: "+Aver);
       System.out.println();

       return 0;
    } //End function Average
} //End class Mo