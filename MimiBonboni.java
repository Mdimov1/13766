package edu.fmi;

import java.util.Scanner;

public class MimiBonboni {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Candy: ");
        int numBonboni = input.nextInt();
        System.out.print("Cal: ");
        double calBonbon = input.nextDouble();

        double allCals = numBonboni*calBonbon;
        System.out.println("Общо калории: "+allCals);
        System.out.println("Може да изядете една ябълка : )");
    }
}
