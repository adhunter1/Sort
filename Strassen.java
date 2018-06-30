import java.util.*;


public class Strassen {

    public static int [][] multiply(int [][] a, int [][] b)
    {
        int size = a.length;
        int [][] c = new int[size][size];

        if((size%2 != 0 ) && (size !=1))
        {
            int[][] a1=new int[size+1][size+1];
            int[][] b1=new int[size+1][size+1];
            int[][]c1=new int[size+1][size+1];
            //int n = size+1;

            for(int i=0; i<size; i++)
            {
                for(int j=0; j<size; j++)
                {
                    a1[i][j] =a[i][j];
                    b1[i][j] =b[i][j];
                }//end for
            }//end for
            c1 = multiply(a1, b1);
            for(int i=0; i<size; i++)
            {
                for(int j=0; j<size; j++)
                {
                    c[i][j] =c1[i][j];
                }//end for
            }//end for
            return c;
        }//end if

        if(size == 1)
        {
            c[0][0] = a[0][0] * b[0][0];
        }else
        {
            //split into 2x2 matrices divide and conquer
            // first matrix
            int [][] a11 = new int[size/2][size/2];
            int [][] a12 = new int[size/2][size/2];
            int [][] a21 = new int[size/2][size/2];
            int [][] a22 = new int[size/2][size/2];
            //second matrix
            int [][] b11 = new int[size/2][size/2];
            int [][] b12 = new int[size/2][size/2];
            int [][] b21 = new int[size/2][size/2];
            int [][] b22 = new int[size/2][size/2];
            //divides first matrix
            divide(a, a11, 0 , 0);
            divide(a, a12, 0 , size/2);
            divide(a, a21, size/2, 0);
            divide(a, a22, size/2, size/2);
            //divides second matrix
            divide(b, b11, 0 , 0);
            divide(b, b12, 0 , size/2);
            divide(b, b21, size/2, 0);
            divide(b, b22, size/2, size/2);
            //makes several different matrices in order to do strassens method
            int [][] one = multiply(add(a11, a22), add(b11, b22));
            int [][] two= multiply(add(a21, a22), b11);
            int [][] three= multiply(a11, subtract(b12, b22));
            int [][] four = multiply(a22, subtract(b21, b11));
            int [][] five = multiply(add(a11, a12), b22);
            int [][] six = multiply(subtract(a21, a11), add(b11, b12));
            int [][] seven = multiply(subtract(a12, a22), add(b21, b22));
            //adds these into final matrixes
            int [][] c11 = add(subtract(add(one, four), five), seven);
            int [][] c12 = add(three, five);
            int [][] c21 = add(two, four);
            int [][] c22 = add(subtract(add(one, three), two), six);
            //copies that infomation over
            copy(c11, c, 0 , 0);
            copy(c12, c, 0 , size/2);
            copy(c21, c, size/2, 0);
            copy(c22, c, size/2, size/2);
        }//end else if
        return c;
    }
    public static void copy(int[][] c, int[][] one, int rowB, int columnB)
    {
        for(int i = 0, j=rowB; i<c.length; i++, j++)//O(n)
        {
            for(int k = 0, l=columnB; k<c.length; k++, l++)//O(n)
            {
                one[j][l] = c[i][k];
            }//end for
        }//end for
    }//end copy
    

    public static int [][] subtract(int [][] a, int [][] b)
    {
        int size = a.length;

        int [][] ans = new int[size][size];

        for(int i=0; i<size; i++)//O(n) goes thru entire list
        {
            for(int j=0; j<size; j++)//O(n) goes thru entire list
            {
                ans[i][j] = a[i][j] - b[i][j];//adds the two 
            }//end for
        }//end for

        return ans;
    }
    public static int [][] add(int [][] a, int [][] b)
    {
        int size = a.length;

        int [][] ans = new int[size][size];

        for(int i=0; i<size; i++)//O(n) goes thru entire list
        {
            for(int j=0; j<size; j++)//O(n) goes thru entire list
            {
                ans[i][j] = a[i][j] + b[i][j];//adds the two 
            }//end for
        }//end for

        return ans;
    }
    public static void divide(int[][] one, int[][] ans, int rowB, int columnB)
    {
        for(int i = 0, j=rowB; i<ans.length; i++, j++)//O(n)
        {
            for(int k = 0, l=columnB; k<ans.length; k++, l++)//O(n)
            {
                ans[i][k] = one[j][l];
            }// end for
        }// end for
    }// end divide
    
    

}
