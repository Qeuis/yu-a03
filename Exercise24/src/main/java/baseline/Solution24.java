/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution24
 *  Copyright 2021 Danny Yu
 */

package baseline;

import java.util.Scanner;
import java.util.Arrays;

public class Solution24
{
    String firstString;
    String secondString;

    public static void main (String [] args)
    {
        // main method where program will execute
        Solution24 app = new Solution24();
        System.out.println("Please enter two strings and I will tell you of they are anagrams.");
        System.out.println("Enter the first string: ");
        app.getFirstString(); // get method for first string
        System.out.println("Enter the second string: ");
        app.getSecondString(); // get method for second string
        isAnagram(app.firstString, app.secondString); // checks and returns if strings are anagrams

    }

    public void getFirstString()
    {
        // method where first string input is received
        Scanner input = new Scanner(System.in);
        this.firstString = input.nextLine();
    }

    public void getSecondString()
    {
        // method where second string input is received
        Scanner input = new Scanner(System.in);
        this.secondString = input.nextLine();
    }


    public static void isAnagram(String firstString, String secondString)
    {
        /*
        returns if user string inputs are anagrams or not
         */
        String stringOne = firstString.replaceAll("\\s", "");
        String stringTwo = secondString.replaceAll("\\s", "");

        boolean status = true;
        if (stringOne.length() != stringTwo.length())
        {
            status = false;
        }
        else
        {
            char[]stringOneArray = stringOne.toLowerCase().toCharArray();
            char[]stringTwoArray = stringTwo.toLowerCase().toCharArray();
            Arrays.sort(stringOneArray);
            Arrays.sort(stringTwoArray);
            status = Arrays.equals(stringOneArray,stringTwoArray);
        }
        if (status)
        {
            System.out.println(firstString + " and " + secondString + " are anagrams.");
        }
        else
        {
            System.out.println(firstString + " and " + secondString + " are not anagrams.");
        }

    }
}