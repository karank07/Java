/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author Karan
 */
public class Palindrome {
    public static void main(String[] args) {
        String s="nitin";
        boolean flag=true;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-i-1))
            {
                flag=false;
            }
        }
        if(flag==false)
        {
            System.out.println("Not palindrome");
        }
        else System.out.println("Palindrome");
    }
    
}
