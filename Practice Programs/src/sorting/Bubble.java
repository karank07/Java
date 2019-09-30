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
class BubbleSort{
    public static void bubbleSort(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=(n-1);j++)
            {
                int temp=0;
                if(arr[j-1]>arr[j])
                {
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
                    
            }
        }
    }
}
public class Bubble {
    public static void main(String[] args) {
        int arr[]={1,4,10,7,13,5,8};
        BubbleSort bs=new BubbleSort();
        bs.bubbleSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
        
    }
}
