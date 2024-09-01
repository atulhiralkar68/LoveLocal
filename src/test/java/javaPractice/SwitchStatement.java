package javaPractice;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Number"); 
        int a = sc.nextInt();

        switch(a){
            case 1 : 
            {
                System.out.println("One");
                break;

            }
            case 2 : 
            {
                System.out.println("Two");
                break;

            }
            case 3 : 
            {
                System.out.println("Three");
                break;

            }
            case 4 : 
            {
                System.out.println("Four");
                break;

            }
            case 5 : 
            {
                System.out.println("Five");
                break;

            }
            case 6 : 
            {
                System.out.println("Six");
                break;

            }
            case 7 : 
            {
                System.out.println("Seven");
                break;

            }
            case 8 : 
            {
                System.out.println("Eight");
                break;

            }
            case 9 : 
            {
                System.out.println("Nine");
                break;

            }
            case 10 : 
            {
                System.out.println("Ten");

            }
        }
    }

}
