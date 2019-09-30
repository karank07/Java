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
public class Reverse {
    public static void main(String[] args) {
        String s="hello";
        String revS="";
        int j=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            revS=revS + s.charAt(i);
        }
        
        System.out.println(revS);
    }
    
}
