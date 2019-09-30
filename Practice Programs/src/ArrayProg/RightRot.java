
package ArrayProg;

/**
 *
 * @author Karan
 */
public class RightRot {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,5};
        int n=2;
        int last,j;
        for(int i=0;i<n;i++)
        {
            last=arr[arr.length-1];
            for(j=arr.length-1;j>0;j--)
            {
                arr[j]=arr[j-1];
            }
            arr[j]=last;
        }
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    
}
