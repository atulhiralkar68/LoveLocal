package javaPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HelloWorld {
    private static int a = 10 ;
    public static void main (String [] args) throws IOException{

        // BufferedReader bfn = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Please enter your Name");
        // String Name = bfn.readLine();
        
        // System.out.println("Entered name is : " +Name);

        Scanner sc = new Scanner (System.in);
        // System.out.println("Enter Firts number");
        // int a = sc.nextInt();
        // System.out.println("Enter Second number");
        // int b = sc.nextInt();

       System.out.println("Enter your Name");
        //input is a string ( one word )
        // read by next() function
        String name = sc.nextLine();
        System.out.println("Name is : " +name );
        
        System.out.println("Enter your city name ");
       // input is a String ( complete Sentence )
        // read by nextLine()function
        String city = sc.next();
        
        
       System.out.println("City is : " + city);

        // System.out.println(a+b);
        // helloWorld();

    }

    public static void helloWorld(){
        System.out.println("Hello World");
    }

    
public class HelloWorld1 {
    
    public void helloWorld1(){
        System.out.println("Hello World");
    }

}


}
