import java.util.Scanner;
import java.util.Random;

class SkroutZ
{
    public double Statistically()
    {
       Random Num1 = new Random();
       Scanner Obj1 = new Scanner(System.in);

       float vi; //Plithos.Par
       float MaxSum=0;
       float RelativeFrequency=0; //Sx.Sixn
       float SumFrequency=0; //Athr.Sixn
       float SumRelativeFrequency=0; //Sx.Athr.Sixn
       float Average; //M-O
       float RulingPrice; //Epikr.Timi

       int Row=0; //Seira
       RulingPrice=-1; 

       System.out.println("Give the number of Random() > 0");
       int xi=Obj1.nextInt(); //System in ---> x
       System.out.println();//---//

       if(xi>0)
       {
            for(int i=0;i<xi;i++)
            {
                vi=Num1.nextFloat(); //Rand numbers
                if(vi>0 )
                {
                    System.out.println("The Random number is: "+vi); //Rand-Numers
                    
                    MaxSum=MaxSum+vi; //Max Random Numbers
                    System.out.println("Sum number is: "+MaxSum);

                    RelativeFrequency=vi/MaxSum; //Sx.Sixn
                    System.out.println("The  Relative Frequency is: "+RelativeFrequency+"%");

                    SumFrequency=SumFrequency+vi; //Athr.Sixn
                    System.out.println("The Sum-Frequency is: "+SumFrequency);

                    SumRelativeFrequency=SumRelativeFrequency/MaxSum; //Sx.Athr.Sixn
                    System.out.println("The Sum-Relative-Freq is: "+SumRelativeFrequency+"%");
                    
                    Average=(xi*vi)/MaxSum; //M-0
                    System.out.println("The Average is: "+Average);

                    Row=Row+1; //Seira
                    if(RulingPrice<vi)
                    {

                        RulingPrice=vi;
                        System.out.println("The row of ruling price is: "+Row+" : "+vi);
                    } //End if EXEI THEMA EDW!!!!
                    System.out.println();
                    System.out.println();
                } //End if        
            } //End for

       } //End if
       else
       {
           System.out.println("No option");
       } //End else if ! x<=0 !

       if(SumFrequency==MaxSum){} //If true!

       System.out.println(); //---//
       System.out.println("The MaxSum is: "+MaxSum); //Control out AllSum


       return 0; //Return
    } //End function Statistically
} //End class SkroutZ