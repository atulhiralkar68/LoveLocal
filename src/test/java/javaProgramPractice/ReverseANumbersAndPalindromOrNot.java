/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaProgramPractice;


public class ReverseANumbersAndPalindromOrNot {

    public static void main(String []args){
       int num = 12321;
       int rev = 0;
       int temp = num;
       int rem;

       while (num>0){

        rem = num%10;
        rev = (rev*10)+ rem;
        num =  num/10;
       }
       System.out.println("Reveresed number is " + rev); 

       if (temp == rev){
        System.out.println("Given number is palindrom");
       }else {
        System.out.println("Given number is not palindrom");
       }
    }
}
