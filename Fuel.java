package edu.fmi;

import java.util.Scanner;

public class Fuel
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter fuel amount: ");
        int fuelAmount = input.nextInt();
        System.out.print("Enter fuel capacity: ");
        int fuelCapacity = input.nextInt();

        if (fuelAmount<1 || fuelAmount<1)
            System.out.print("Unvalid input!");
        else if (fuelAmount<=fuelCapacity*0.10)
            System.out.println("Red!");
        else
            System.out.println("Green!");
    }
}
