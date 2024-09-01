/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package JavaPrograms;

/**
 *
 * @author Hp
 */
public class FibonacciSeries {

// In Fibonacci series, next number is the sum of previous two numbers
// Input = First 10 Numbers
// Output = 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc.
// The first two numbers of Fibonacci series are 0 and 1.

public static void main(String []args){

    int num1 = 0, num2 = 1, num = 10;

    for (int i = 0; i<=num ; i++)
    {
        System.out.print(num1 + " ");

        int num3 = num1 + num2 ;
        num1 = num2;
        num2 = num3 ;
    }
}
}
