package edu.fmi;

import java.util.Scanner;

public class KvadratnoUravnenie {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a = ");
        double a = input.nextDouble();
        System.out.print("b = ");
        double b = input.nextDouble();
        System.out.print("c = ");
        double c = input.nextDouble();

        double diskriminanta = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + diskriminanta) / 2 * a;
        double x2 = (-b - diskriminanta) / 2 * a;

        if (a == 0 || diskriminanta < 0)
            System.out.println("Няма решение!");
        else if (diskriminanta == 0) {
            x1 = x2;
            System.out.printf("Решение е двойният корен %.2f", x1);
        } else {
            System.out.printf("Решение са %.2f", x1);
            System.out.printf(" и %.2f", x2);
        }
    }
}
