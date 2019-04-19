package edu.fmi;

import java.util.Scanner;

public class MagicNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter day of born: ");
        int day = input.nextInt();
        System.out.print("Enter month of born: ");
        int month = input.nextInt();
        System.out.print("Enter year of born: ");
        int year = input.nextInt();

        int daySum = day / 10 + day % 10;
        int monthSum = month / 10 + month % 10;
        int yearSum = year/1000+(year/100)%10+(year%100)/10+year%10;
        int sumBirthday = daySum+monthSum+yearSum;
        int magicNum = sumBirthday / 10 + sumBirthday % 10;

        System.out.println("Your magic num is: "+magicNum);
    }
}
