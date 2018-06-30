public class Quick {
     
    private int arr[];
    private int size;
 
    public void sort(int[] a) {
        //checks if array is empty and if it is breaks out the method
        if (a == null || a.length == 0) 
        {
            return;
        }//end if
        this.arr = a;//sets elements in a to arr
        size = a.length;//sets size to the length of the method
        
        quickSort(0, size - 1);//starts the sorting
    }//end sort
 
    private void quickSort(int left, int right) 
    {
        //sets temporary holders for begginning and end indexes
        int l = left;
        int r = right;
        // calculates the middle number 
        int middle = arr[left+(right-left)/2];
        // divides the array 
        while (l <= r) //checks if list is all checked
        //O(n) because goes through entire list
        {
            while (arr[r] > middle)//O(n/2) bc goes through half of list
            {
                r--;//O(1)
            }// end while
            while (arr[l] < middle)//O(n/2) bc goes through half of list
            {
                l++;//O(1)
            }//end while
            //these two while loops become O(n) 
            
            if (l <= r) //O(1)
            {
                //switches the numbers after checked items to see which is greater than middle
                int hold = arr[l];//O(1)
                arr[l] = arr[r];//O(1)
                arr[r] = hold;//O(1)
                //puts indexes onto other percpective sides
                l++;//O(1)
                r--;//O(1)
            }//end if
        }//end while
        //after going thru all these loops the time complexity is O(n^2)
        if (left < r)//sorts recursively
        {
            quickSort(left, r);//O(n^2) bc goes through the 3 while loops 
        }//end if
        if (l < right)//sorts recursively
        {
            quickSort(l, right);//O(n^2) bc goes through the 3 while loops 
        }//end if
    }//end quickSort
     
    
}
