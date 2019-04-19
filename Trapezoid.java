package edu.fmi;

import java.util.Scanner;

public class Trapezoid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.print("h = ");
        int h = input.nextInt();

        int downSideoOfTriangle = (a-b)/2;
        double bedro = Math.sqrt(downSideoOfTriangle*downSideoOfTriangle+h*h);
        double perimetyr = bedro*2+a+b;
        int lice = (a+b)*h/2;

        System.out.printf("Дължината на бедрото на трапеца е: %.2f", bedro);
        System.out.println();
        System.out.printf("Периметъра на трапеца е: %.2f", perimetyr);
        System.out.println();
        System.out.println("Лицето на трапеца e: " + lice);






    }
}
