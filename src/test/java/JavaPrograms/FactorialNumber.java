/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package JavaPrograms;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class FactorialNumber {

    public static void main(String [] args){

        Scanner sc = new Scanner (System.in);

        System.out.println("Enter number for which you want factorial");

        int num = sc.nextInt();

        int fact = 1;
        for (int i = 1; i<= num ; i++){
            fact = fact * i;
        }
        System.out.println("Factorial for " + num + " is " + fact);
    }

}
