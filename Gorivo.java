package edu.fmi;

import java.util.Scanner;

public class Gorivo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Въведете цена на литър гориво: ");
        double priceFuelOneLiter = input.nextDouble();
        System.out.print("Разход на 100 км пробег: ");
        double razhodAvtomobil = input.nextDouble();
        System.out.print("Изминато разтояние в км: ");
        int km = input.nextInt();

        double litriGorivoZaEdinKm = razhodAvtomobil/100;
        double litriGorivoZaCeliqPyt = km*litriGorivoZaEdinKm;
        double sumaZaGorivo = litriGorivoZaCeliqPyt*priceFuelOneLiter;

        System.out.printf("Общо цена за изминалия път: %.2f", sumaZaGorivo);
    }
}
