package javaPractice;

import java.util.Scanner;

public class PrintInputTimes {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int a = sc.nextInt();
        

        // for(int i = 0; i<a;i++){
        //     System.out.println(a);        
        //     }
           

        //    int i = 0;
        //    while (i<a){
        //     System.out.println(a);
        //     i++;
        //    }

           int j = 0;
           if(a!=0){
           do{
            System.out.println(a);
            j++;
           }while (j<a);
        }
    }
}
