package javaPractice;

import java.util.Scanner;

public class PrintNumber1223334444 {
    public static void main(String []args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int numOfLine = sc.nextInt();

        for (int i = 1 ; i<=numOfLine;i++)
        {
            for (int j = 0;j<i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}