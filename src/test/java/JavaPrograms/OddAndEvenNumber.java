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
public class OddAndEvenNumber {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");

        int a = sc.nextInt();
        if (a%2==0){
            System.out.println(a + " Even number ");
        }else {
            System.out.println(a + " Is Odd number");
        }
    }

}
