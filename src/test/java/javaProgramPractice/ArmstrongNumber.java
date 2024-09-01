/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaProgramPractice;

/**
 *
 * @author Hp
 */
public class ArmstrongNumber {

    //Given number is 153 

    public static void main(String []args){

        int num =153, res, temp,sum;
        sum = 0;
        temp = num;

        while (num>0){

            res = num%10;
            num = num/10;

            sum = sum +(res*res*res);
        }

        if (temp == sum){
            System.out.println("Given number is Armstrong number");
        }else {
            System.out.println("Given number is not Armstrong number");
        }
    }
}
