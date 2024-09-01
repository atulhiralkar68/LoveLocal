/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package javaProgramPractice;

import java.util.Arrays;

public class AnagramString{

    public static void main(String []args ){

        String str1 = "Army";
        String str2 = "Mary";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        int lenghthstr1 = str1.length();
        int lenghtstr2 =  str2.length();

        if (lenghthstr1==lenghtstr2){

            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2)){
                
                System.out.println(str1+" and " + str2 + " are Anagram ");
            }else 
            {
                System.out.println(str1+ " and " + str2 + " are not anagram");
            }          


        }else {
            System.out.println(str1 + " and " + str2 + " are not anagram");
        }
    }
}