package edu.fmi;

import java.util.Scanner;

public class Floors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter floor: ");
        int floor = input.nextInt();

        if (floor<1 || floor==13 || floor>21)
           System.out.println("Unvalid floor!");
        else if (floor>13)
            floor--;
        else
            floor=floor;

        System.out.println("Your floor is "+floor);
    }
}
