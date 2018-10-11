package edu.fmi;

import java.util.Scanner;

public class KibibyteDay
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter price: ");
        double price = input.nextDouble();

        double discount=0;
        double allSum = 0;

        if (price<1)
            System.out.println("Unvalid input!");
        else if (price>=1 & price<128 )
        {
            discount = 0.92;
            allSum = price*discount;
            System.out.printf("Your sum is: %.2f", allSum);
        }
        else
            {
            discount = 0.84;
            allSum = price*discount;
            System.out.printf("Your sum is: %.2f", allSum);
        }
    }
}
