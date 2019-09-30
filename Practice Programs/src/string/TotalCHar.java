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
public class TotalCHar {
    public static void main(String[] args) {
        String s="Today is a sunny day";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
            {
                ++count;
            }
        }
        System.out.println(count);
    }
    
}
