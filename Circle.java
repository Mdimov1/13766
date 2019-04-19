package edu.fmi;

import java.util.Scanner;

public class Circle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Въведете радиус: ");
        double r = input.nextDouble();

        double p = Math.PI*2*r;
        double s = Math.PI*r*r;

        System.out.printf("Дължината на окръжността е %.2f", p);
        System.out.println();
        System.out.printf("Лицето на кръга е %.2f", s);
    }
}
