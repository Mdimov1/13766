package edu.fmi;

import java.util.Scanner;

public class UravnenieAB
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();

        double x = 0;

        if (a==0 & b!=0)
            System.out.println("Няма решение!");
        else if (a == 0 & b == 0)
            System.out.println("Всяко x е решение!");
        else {
            x = b / a;
            System.out.printf("x = %.2f ", x);
        }
    }
}
