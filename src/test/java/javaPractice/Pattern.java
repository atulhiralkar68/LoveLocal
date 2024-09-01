package javaPractice;

import java.util.Scanner;

public class Pattern {
    public static void main (String []args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        for (int i =0;i<=a;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            //System.out.println("");
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=a;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
            for (int i =1;i<=a;i++)
            {
                for(int j=a;j>i;j--)
                {
                    System.out.print("*");
                }
                
                System.out.println("");
            }
            

    }

}
