/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package JavaPrograms;

/**
 *
 * @author Hp
 */
public class ReverseANumbersAndPalindromOrNot {

    public static void main (String []args){
        // 1. Reverse a Number Using the While Loop reversed number
        int num = 12321;
        int rev = 0;
        int temp =num;
        int rem; // Remainder

        while (num > 0){
            rem = num %10;
            rev = (rev * 10) + rem;
            num = num/10;
        }
        System.out.println("Reversed number is " + rev);
        // Verify number is Palindrom or Not
        if (temp==rev){
            System.out.println("The given number is Palindrom");
        }else{
            System.out.println("The given number is Not Palindrom");
        }
    }

}
