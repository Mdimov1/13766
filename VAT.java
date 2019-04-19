package edu.fmi;

import java.util.Scanner;

public class VAT
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Price: ");
        double price = input.nextDouble();
        System.out.print("Amount: ");
        double amount = input.nextDouble();
        System.out.print("VAT: ");
        double vat = input.nextDouble();

        double finalPriceForOne = price+price*vat;
        double allSum = finalPriceForOne*amount;

        System.out.printf("All sum is %.2f", allSum);
    }
}
