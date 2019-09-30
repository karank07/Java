/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;


/**
 *
 * @author Karan
 */


public class Binary {
    public static void main(String[] args) {
        int arr[]={10,20,30,45,48,49,50,55,60,70,80,90};
        int key=50;
        int n=arr.length;
        int mid=n/2,first=0,last=n;
        while(first<=last)
        {
            if(key>arr[mid])
            {
                first=mid+1;
                
            }
            else if(key==arr[mid])
            {
                System.out.println("Found at:"+(mid+1));
                break;
            }
            else
                last=mid-1;
        }
    }
    
}
