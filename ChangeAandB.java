package edu.fmi;

import java.util.Scanner;

public class ChangeAandB
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();

        int novaProm = a;
        a = b;
        b=novaProm;

        System.out.println("a = "+a);
        System.out.println("b = "+b);


        //Втори начин
        //Сменени са имената на обектите за да са различни от горните

        Scanner inputt = new Scanner(System.in);

        System.out.print("a = ");
        int x = inputt.nextInt();
        System.out.print("b = ");
        int y = inputt.nextInt();

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("a = "+x);
        System.out.println("b = "+y);

    }
}
