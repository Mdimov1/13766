package edu.fmi;

import java.util.Scanner;

public class Zoo
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Num of animals: ");
        int n = input.nextInt();
        System.out.print("Num of legs: ");
        int k = input.nextInt();

        int rabbits=0;
        int chickens = 0;

        if (k%2!=0)
            System.out.println("Unvalid input!");
        else {
            for (int i = 4; i <= k; i = i + 4) {
                rabbits++;
                if ((k - i) - (n - rabbits) * 2 == 0) {
                    chickens = n - rabbits;
                    break;
                }
            }
        }
        System.out.println("Rabbits are "+rabbits+" and num of chickens is "+chickens+"!");
    }
}
