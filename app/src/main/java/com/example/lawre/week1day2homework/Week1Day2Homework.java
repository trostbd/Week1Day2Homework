package com.example.lawre.week1day2homework;

import java.lang.*;
import java.util.ArrayList;

public class Week1Day2Homework
{

    public static void main(String[] args)
    {
        Week1Day2Homework homework = new Week1Day2Homework();
        ArrayList<String> dupList= new ArrayList<String>();
        dupList.add("grass");
        dupList.add("vehicle");
        dupList.add("recover");
        dupList.add("friend");
        dupList.add("debut");
        dupList.add("recover");
        dupList.add("index");
        dupList.add("vehicle");
        System.out.println("Problem One: \n");
        homework.findDuplicates(dupList);
        System.out.println("\n Problem Two: \n");
        System.out.println("racecar is " + homework.checkPalindrome("racecar"));
        System.out.println("traffic is " + homework.checkPalindrome("traffic"));
        System.out.println("\n Problem Three: ");
        homework.fizzBuzz(20);
        System.out.println("\n Problem Four: ");
        System.out.println(homework.checkAnagrams("taco","coat"));
        System.out.println(homework.checkAnagrams("claw","team"));
        System.out.println("\n Problem Five: ");
        homework.printTables();

    }

    public void findDuplicates(ArrayList<String> strings)
    {
        ArrayList<String> duplicates = new ArrayList<String>();
        for(int currWordPos = 0; currWordPos < strings.size(); currWordPos++)
        {
            String currWord = strings.get(currWordPos);
            for(int currTestPos = currWordPos +1; currTestPos < strings.size();currTestPos++)
                if(strings.get(currWordPos).equals(strings.get(currTestPos)))
                    duplicates.add((currWord));
        }
        for(int i = 0; i < duplicates.size();i++)
            System.out.println(duplicates.get(i));
    }

    public boolean checkPalindrome(String word)
    {
        String reverseWord = "";
        for(int i = word.length()-1; i >=0; i--)
            reverseWord = reverseWord.concat("" + word.charAt(i));
        return word.equals(reverseWord);
    }

    public void fizzBuzz(int count)
    {
        for(int i = 1; i <= count; i++)
        {
            if(i % 3 == 0)
                System.out.print("fizz");
            if(i % 5 == 0)
                System.out.print("buzz");
            if(i % 3 != 0 && i % 5 != 0)
                System.out.print(i);
            System.out.print("\n");

        }
    }

    public boolean checkAnagrams(String word1, String word2)
    {
        for(int i = 0; i < word1.length();i++)
            if(!(word2.contains(""+word1.charAt(i))))
                return false;
        return true;
    }

    public void printTables()
    {
        for(int i = 1; i < 11; i++)
        {
            for(int j = 1; j < 11; j++)
                System.out.print(i*j + " ");
            System.out.print("\n");
        }
    }
}
