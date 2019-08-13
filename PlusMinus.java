package edu.softuni.polymorphism.DemoTest;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(input.next());
        }

        int countPositive = 0;
        int countNegative = 0;
        int countZeros = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0){
                countNegative++;
            } else if (nums[i] == 0){
                countZeros++;
            } else {
                countPositive++;
            }
        }

        Double positiveFraction = (double) countPositive/n;
        Double negativeFraction = (double) countNegative/n;
        Double zerosFraction = (double) countZeros/n;

        System.out.printf("Fraction of positive numbers is %f", positiveFraction);
        System.out.println();
        System.out.printf("Fraction of negative numbers is %f", negativeFraction);
        System.out.println();
        System.out.printf("Fraction of zeros is %f", zerosFraction);
    }
}
