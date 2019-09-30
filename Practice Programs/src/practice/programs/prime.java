package practice.programs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karan
 */
import java.util.*;
public class prime {
    public static void main(String[] args) {
    int n;
    Scanner s= new Scanner(System.in);
        System.out.println("enter number:");
    n=s.nextInt();
    int flag=0;
    for(int i=2;i<n;i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
            
        }
    }
    if(flag==1)
            System.out.println("Not prime");
    else
            System.out.println("Prime");
    }    
}
