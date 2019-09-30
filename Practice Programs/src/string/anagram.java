/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.Arrays;

/**
 *
 * @author Karan
 */
class Sort{
    char[] sortS(String s)
    {
        char a[]=new char[s.length()];
        s.getChars(0, s.length(), a, 0);
        
        Arrays.sort(a);
        
        
        return a;
    }
}
public class anagram  {
    public static void main(String[] args) {
        String s1="hello";
        String s2="elohl";
        Sort so=new Sort();
        char[] a1=so.sortS(s1);
        char[] a2=so.sortS(s2);
        if(Arrays.equals(a1, a2))
            System.out.println("Anagram");
        else System.out.println("Not anagram");
        
   
    }
    
}
