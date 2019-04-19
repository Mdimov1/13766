package edu.fmi;

import java.util.Scanner;

public class RealVariables
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();

        double max = Math.max(a,b);
        double finalMax = Math.max(max,c);
        double min = Math.min(a,b);
        double finalmin = Math.min(min,c);

        System.out.println("Max of them is: "+finalMax);
        System.out.println("Min of them is: "+finalmin);
    }
}
