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
public class NoWhiteSpace {
    public static void main(String[] args) {
        String s="hello how are you";
        s=s.replaceAll("\\s+","");
        System.out.println(s);
    }
    
}
