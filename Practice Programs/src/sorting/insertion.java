/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author Karan
 */
class InsertionSort{
    void insertionSortFun(int[] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int val=arr[i];
            int j=i-1;
            while((j>-1)&&arr[j]>val)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=val;
        }
    }
}
public class insertion {
    public static void main(String[] args) {
        int arr[]={2,1,5,9,7,8};
        InsertionSort is=new InsertionSort();
        is.insertionSortFun(arr);
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");
    }
    
}
