
package ArrayProg;

/**
 *
 * @author Karan
 */
public class LeftRot {
    public static void main(String[] args) {
        
    
    int arr[]=new int[]{1,2,3,4,5};
    int n=3,first,j;
    
    for(int i=0;i<n;i++)
    {
        first=arr[i];
        for(j=i;j<arr.length-1;j++)
        {
            arr[j]=arr[j+1];
        }
        arr[j]=first;
       
    }
    for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
}
