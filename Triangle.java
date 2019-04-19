package edu.fmi;

import java.util.Scanner;

public class Triangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Въведете страна а: ");
        double a = input.nextDouble();
        System.out.print("Въведете страна b: ");
        double b = input.nextDouble();
        System.out.print("Въведете страна c: ");
        double c = input.nextDouble();

        double perimetyr = a+b+c;
        double p = perimetyr/2;
        double lice = Math.sqrt(p*(p-a)*(p-b)*(p-c));

        System.out.printf("Периметъра на триъгълника е %.2f", perimetyr);
        System.out.println();
        System.out.printf("Лицето на триъгълника е %.2f", lice);
    }
}
