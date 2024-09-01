package javaPractice;

import java.util.Scanner;

public class PrintNextDigitOfinputNumber {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number ");

        int a = sc.nextInt();
        // if(a!=0){
        int count = 0 ;
        int temp=a;

        // while(count<a)
        // { 
        //     System.out.println(temp);
        //     temp = temp+1;
        //     count++;
        // }   
        for(int i =0 ; i<a;i++){
            System.out.println(temp);
            temp = temp+1;
            //count++;

        }
    }
}
