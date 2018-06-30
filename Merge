

public class Merge
{
    int size;// size of array
    int [] arr= new int[size];// array
    int[] hold=new int[size];// copy of array for 
    //method to call in main
    public void sort(int given[]) 
    {
        this.arr = given;
        this.size = given.length;
        this.hold = new int[size];
        mergeSort(0, size - 1);
    }// end sort
 
    private void mergeSort(int left, int right) {
         
        if (left < right) {
            int middle = left + (right - left) / 2;// middle point 
            mergeSort(left, middle);//sorts left side
            mergeSort(middle + 1, right);//sorts right side
            mergeList(left, middle, right);//merges the sides
        }
    }
    private void mergeList(int left, int middle, int right) {
 
        for (int i = left; i <= right; i++) 
        {
            hold[i] = arr[i];//sets hold to array
        }//end for
        int l1 = left;
        int m = middle + 1;
        int l2 = left;
        while (m <= right&&l1 <= middle ) 
        {
            if (hold[l1] <= hold[m]) 
            {
                arr[l2] = hold[l1];
                l1++;
            } else {
                arr[l2] = hold[m];
                m++;
            }//end else if
            l2++;
        }//end while
        while (l1 <= middle) 
        {
            arr[l2] = hold[l1];
            l2++;
            l1++;
        }//end while
 
    }//end mergeList
}
