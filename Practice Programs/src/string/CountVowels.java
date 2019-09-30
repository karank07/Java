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
public class CountVowels {
    public static void main(String[] args) {
        String s="hello how are you";
        s=s.toLowerCase();
        
        char[] a=s.toCharArray();
        int vow=0,con=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
                vow++;
            else if(a[i]>'a' && a[i]<'z')
                con++;
        }
        System.out.println("no. of vowles:"+ vow);
        System.out.println("no. of consonant:"+ con);
        
    }
}
