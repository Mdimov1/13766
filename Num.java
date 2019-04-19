package edu.fmi;

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();

        int firstSymbol = num/100;
        int secondSymbol = (num/10)%10;
        int third = num%10;
        int newNum = third*100+secondSymbol*10+firstSymbol;
        int ostatyk = num%newNum;

        System.out.println(newNum);
        System.out.println(ostatyk);
    }
}
