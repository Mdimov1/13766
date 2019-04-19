package edu.fmi;

import java.util.Scanner;

public class MinMax
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        System.out.println("min = " + min);
        System.out.println("max = " + max);



        //Втори начин

        int x = input.nextInt();
        int y = input.nextInt();
        int mIn;
        int mAx;

        if (x > y)
        {
          mIn=y;
          mAx=x;
        }
        else
        {
            mIn=x;
            mAx=y;
        }

        System.out.println("min = "+mIn);
        System.out.println("max = "+mAx);
    }
}
