/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package JavaPrograms;

/**
 *
 * @author Hp
 */
//Q. Swap 2 numbers
// Input int a = 100;
// int b = 200;
//Output is int a = 200, b = 100;
public class SwapTwoNumber {
    public static void main(String [] args){

        int a = 100, b = 200;
        // Swapping using three variable(Temp) 
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping, a = " + a + " and b = " + b );

        //Swapping using 2 variable (Values are a = 200, b = 100)
        a = a+b; // a = 200+100 = 300
        b = a-b; // b = 300-100 = 200
        a = a-b; // a = 300-200 = 100

        System.out.println("After swapping, a = " + a + " and b = "+b);

        

    }

    



}
