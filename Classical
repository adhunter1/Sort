public class Classical
{
   

    //since it goes through 3 for loops the time complexity is O(n^3)
    public int[][] multiply(int[][]a,int[][] b,int size)
    {
        int[][] hold=new int[size][size];
        for (int i = 0; i < size; i++)//O(n) bc goes through whole list
        {
            for (int j = 0; j < size; j++)//O(n) bc goes through whole list
            {
                for (int k = 0; k < size; k++)//O(n) bc goes through whole list
                {
                    hold[i][j] = hold[i][j] + (a[i][k] * b[k][j]);//O(1)
                }//end if
            }//end if
        }//end if
        return hold;
    }
}
