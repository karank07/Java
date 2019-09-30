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
public class Swap {
    public static void main(String[] args) {
        String s1="good";
        String s2="Morning";
        int l1=s1.length();
        int l2=s2.length();
        s1=s1+s2;
        s2=s1.substring(0, s1.length()-l2);
        s1=s1.substring(s1.length()-l2, s1.length());
        System.out.println("s1: "+ s1);
        System.out.println("s2: "+ s2);
    }
    
}
