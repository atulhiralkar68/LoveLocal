/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package JavaPrograms;

import java.util.Arrays;

/**
 *
 * @author Hp
 */

 //Q. String Angram : determine if two string are Anagram of each other.
 // String str1 = "Army"
 //String str 2 = "Mary"
 //Output : String army and mary are anagram
public class AnagramStrings {
    public static void main (String []args){

        String str1 = "Army";
        String str2 = "Mary";

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //Check if the lenghth is same
        if (str1.length()==str2.length())
        {
            //Convert String to charArray
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            //Sort the charArray
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            //If sorted charArray is are same then the string is Anagram
            boolean result = Arrays.equals(charArray1, charArray2);
            if(result)
            {
                System.out.println(str1 + " and " + str2 + " are Anagram");
            } else 
            {
                System.out.println(str1 + " and " + str2 + " not Anagram");
            }
        }else
        {
            System.out.println(str1 + " and "+ str2 + " not Anagram");
        }

    }

}
