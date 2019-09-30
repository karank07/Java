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
public class IndividualChar {
    public static void main(String[] args) {
        String s="hello";
        for(int i=0;i<s.length();i++)
        {
            System.out.println("Char at "+ (i+1) +" : "+ s.charAt(i));
        }
    }
    
}
