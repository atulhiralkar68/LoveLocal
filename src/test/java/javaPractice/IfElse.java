package javaPractice;

import java.util.Scanner;

public class IfElse {
    
    public static void main(String []args){

    Scanner sc = new Scanner (System.in);
    System.out.println("Enter 1st number");
    int a = sc.nextInt();
    System.out.println("Enter 2nd Number");
    int b = sc.nextInt();

    if(a>b){
        System.out.println(" A is greater");
    }else if (b>a){
        System.out.println("B is greater");
    }else{
        System.out.println("A and B are same");
    }
    }

}
