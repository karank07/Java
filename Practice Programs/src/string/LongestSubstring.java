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
public class LongestSubstring {
    
    static String strcmp(String s1,String s2)
    {
        int n=Math.min(s1.length(), s2.length());
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                return s1.substring(0, i);
            }
            
            
        }
            return s1.substring(0, n);
    }
    public static void main(String[] args) {
        
        String s="abcdeabcf";
        String ls="";
        int n=s.length();
        
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                String x=strcmp(s.substring(i, n),s.substring(j, n));
                if(x.length()>ls.length()) ls=x;
            }
            
        }
        System.out.println(ls);
    }
    
}
