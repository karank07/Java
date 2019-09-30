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
public class Subsets {
    public static void main(String[] args) {
        String s="fun";
        int len=s.length();
        int newLen=(len*(len+1))/2,temp=0;
        String[] sub=new String[newLen];
        for(int i=0;i<len;i++)
        {
            for(int j=i;j<len;j++)
            {
                sub[temp]=s.substring(i, j+1);
                ++temp;
            }
        }
        for(int i=0;i<newLen;i++)
        {
            System.out.println(sub[i]);
        }
    }
}
