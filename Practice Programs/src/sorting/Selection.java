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
class SelectionSort{
    static void selectionSort(int[] arr)
    {
        int index,temp;
        for(int i=0;i<arr.length-1;i++)
        {
            index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[index])
                {
                    index=j;
                }
            }
            
                temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
        }
    }
}
public class Selection {
    public static void main(String[] args) {
        int arr[]={3,1,4,7,6,5,2};
        SelectionSort ss=new SelectionSort();
        ss.selectionSort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
