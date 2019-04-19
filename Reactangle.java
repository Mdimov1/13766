package edu.fmi;

import java.util.Scanner;

public class Reactangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = :");
        int b = input.nextInt();

        int perimetyr = 2*a+2*b;
        int liceNaPrav = a*b;

        System.out.println("Периметъра на правоъгълникът е : "+perimetyr+" см");
        System.out.println("Лицето на правоъгълникът е: "+liceNaPrav+" см");
    }
}
