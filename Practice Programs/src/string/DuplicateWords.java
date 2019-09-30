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
public class DuplicateWords {
    
    public static void main(String[] args) {
        
        String s="hello my name is karan hello";
        
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j) && s.charAt(i)!=' ')
                {
                    
                }
                    
            }
        }
    }
    
}
