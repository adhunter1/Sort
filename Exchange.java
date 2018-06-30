
public class Exchange
{
    int size;//original size
    int[] array= new int[size];//original array
    public  void sort(int[] arr) {
        int hold;//to hold elements in array while switching numbers
        
        for(int i=0;i<arr.length-1;i++)//O(n-1) bc goes through entire list but one
        {
            for(int j=i+1;j<arr.length;j++)//O(n-1) bc goes through entire list but one
            {
                if(arr[i]>arr[j])
                {
                    hold = arr[i];//O(1)
                    arr[i] = arr[j];//O(1)
                    arr[j] = hold;//O(1)
                }//end if
            }//end for
        }//end for
    }
}
