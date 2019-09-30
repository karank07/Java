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
public class armstrong {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=s.nextInt();
        int temp=n;
        int r,c=0;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            c=c+(r*r*r);
        }
        if(temp==c)
            System.out.println("Armstrong");
        else    
            System.out.println("not armstrong");
    }
}
