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
public class LowerToUpper {
    public static void main(String[] args) {
        String s="Hello good Day";
        StringBuffer str=new StringBuffer(s);
        
        for(int i=0;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
            {
                str.setCharAt(i, Character.toLowerCase(s.charAt(i)));
            }
            else if(Character.isLowerCase(s.charAt(i)))
            {
                str.setCharAt(i, Character.toUpperCase(s.charAt(i)));
            }
        }
        System.out.println(str);
        
    }
    
}
