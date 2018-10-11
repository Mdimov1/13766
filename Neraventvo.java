package edu.fmi;

import java.util.Scanner;

public class Neraventvo
{
    public static void main(String[] args)
    {
     Scanner input = new Scanner(System.in);

     System.out.println("a*x+b<0 ?");
     System.out.print("a = ");
     double a = input.nextDouble();
     System.out.print("b = ");
     double b = input.nextDouble();

     double reshenieNaX = 0;

     if (a==0 & b<0)
         System.out.println("Всяко х е решение!");
     else if (a==0 & b>=0)
         System.out.println("Няма решение!");
     else if (a > 0 && b>0)
     {
         reshenieNaX = -b/a;
         System.out.printf("Решението на х е от минус безкрайност до %.2f!", reshenieNaX);
     }
     else if (a>0 && b<0)
        {
            reshenieNaX = -b/a;
            System.out.printf("Решението на х е от минус безкрайност до %.2f!", reshenieNaX);
        }
        else if (a<0 && b<0)
            {
                reshenieNaX=b/a;
                System.out.println("Решението на х е от %.2f ")
                        //0897899447
            }
    }
}
