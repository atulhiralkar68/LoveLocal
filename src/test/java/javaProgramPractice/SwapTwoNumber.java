/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaProgramPractice;

/**
 *
 * @author Hp
 */
public class SwapTwoNumber {

    public static void main(String[] args){
        int a = 100, b = 200;
        int temp;
        temp = a;
        a=b;
        b=temp;

        System.out.println("After swip Value of a is " + a + " and value of b is " + b );
        // a = 200 and b = 100
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After swip Value of a is " + a + " and value of b is " + b );

        // a = 100 and b = 200

        a = a^b;
        b = a^b;
        a = a^b;

        System.out.println("After swip Value of a is " + a + " and value of b is " + b );
    }

}
