
package ArrayProg;

/**
 *
 * @author Karan
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,1,3,5};
        int temp[]=new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]!=arr[j])
                {
                   temp[k]=arr[i];
                   k++;
                }
            }
        }
        for(int i=0;i<temp.length;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
