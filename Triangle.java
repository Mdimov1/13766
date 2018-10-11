package edu.fmi;

import java.util.Scanner;

public class Triangle {  //public static double angle(double a, double b, double c) {
    //     return Math.acos((a*a+b*b-c*c)/(2*a*b));
    // }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();

        double angleA = 0;
        double angleB = 0;
        double angleC = 0;

        if (a + b <= c || a + c <= b || b + c <= a)
            System.out.println("Няма такъв триъгълник!");
        else {
            angleA = Math.toDegrees(Math.acos((b * b + c * c - a * a) / (2 * b * c)));
            angleB = Math.toDegrees(Math.acos((a * a + c * c - b * b) / (2 * a * c)));
            angleC = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));

            System.out.printf("Degrees of angle A: %.3f", angleA);
            System.out.printf("Degrees of angle B: %.3f", angleB);
            System.out.printf("Degrees of angle C: %.3f", angleC);
            //System.out.println("Degrees of angle A: " + Math.toDegrees(angle(c,b,a)));
            //System.out.println("Degrees of angle B: " + Math.toDegrees(angle(a,c,b)));
            //System.out.println("Degrees of angle C: " + Math.toDegrees(angle(a,b,c)));
        }

    }
}
