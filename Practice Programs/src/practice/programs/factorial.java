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
public class factorial {
    public static void main(String[] args) {
        System.out.println("enter a number:");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(n>0)
        {
            i=i*n;
            --n;
        }
        System.out.println(i);
    }
    
}
