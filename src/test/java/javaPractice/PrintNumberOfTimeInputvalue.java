package javaPractice;

import java.util.Scanner;

public class PrintNumberOfTimeInputvalue {
    public static void main(String []ars){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        for(int i = 1; i<=a;i++ ){
            System.out.println(i);
        }
            
    }

}
