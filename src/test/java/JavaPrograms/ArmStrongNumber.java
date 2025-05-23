/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package JavaPrograms;

/**
 *
 * @author Hp
 */
public class ArmStrongNumber {

    //Armstrong number is a number that is equal to the sum of cubes of its digits.
    //153 is an Armstrong number. ==> (1*1*1) + (5*5*5) + (3*3*3) = 153
    public static void main(String [] args){
        int sum = 0, res , temp;
        int num = 153; // Its number to check Armstrong or not
        temp = num;

        while (num>0){

            res = num %10;
            num = num/10;

            sum = sum + (res*res*res);
        }
        if (temp == sum)
        {
            System.out.println(" 153 is Armstrong number");
        }else 
        {
            System.out.println(" 153 is not a armstrong number");
        }
    }
}
