package practice.programs;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karan
 */
public class fibo {
    public static void main(String[] args) {
        int i=0;
        int j=1,k;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter range:");
        int n=s.nextInt();
        System.out.print("0 1 ");
        for(int count=0;count<n-2;count++)
        {
            k=i+j;
            i=j;
            j=k;
            
        System.out.print(k+ " ");    
        }
     
    }
    
}
