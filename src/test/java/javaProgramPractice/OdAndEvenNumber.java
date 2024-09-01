/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaProgramPractice;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class OdAndEvenNumber {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        
        if (a%2==0){
            System.out.println(a + " is Even number");
        }else {
            System.out.println(a + " is Odd number");
        }
    }
}
