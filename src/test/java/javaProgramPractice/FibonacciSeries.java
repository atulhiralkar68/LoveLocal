/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaProgramPractice;

/**
 *
 * @author Hp
 */
public class FibonacciSeries {

    public static void main (String []args)
    {
        int num1 = 0, num2 = 1, num = 10;

        for(int i = 0; i<=num; i++)
        {
            System.out.println(num1);

            int num3 = num1+num2;
            num1 = num2;
            num2 = num3;
        }
    }
}
