
import java.util.Random;
public class Project1
{   
    public static void main(String[] args)
    {
        //max sizes for different programs in coments after
        int mergeSortSize=1000;//1000000;
        int quickSortSize=100;//1200000;
        int exchangeSortSize=100;//600000;
        int cSize=2;//2304
        int sSize=2;//2025;
        //initialize the arrays
        int[] arrMerge=new int[mergeSortSize];
        int[] arrQuick=new int[quickSortSize];
        int[] arrExchange=new int[exchangeSortSize];
        int[][] arrC=new int[cSize][cSize];
        int[][] arrCb=new int[cSize][cSize];
        int[][] arrS=new int[sSize][sSize];
        int[][] arrSb=new int[sSize][sSize];
        //randomize the arrays
        rand(arrMerge);
        rand(arrQuick);
        rand(arrExchange);
        randMatrix(arrC);
        randMatrix(arrCb);
        randMatrix(arrS);
        randMatrix(arrSb);
        //initialize classes
        Merge mergeSort= new Merge();
        Quick quickSort = new Quick();
        Exchange exchangeSort=new Exchange();
        Classical cMatrix= new Classical();
        Strassen sMatrix= new Strassen();
        //sort the different arrays
        mergeSort.sort(arrMerge);
        quickSort.sort(arrQuick);
        //System.out.println("done:");
        exchangeSort.sort(arrExchange);
        arrC=cMatrix.multiply(arrC,arrCb,cSize);
        sMatrix.multiply(arrS,arrSb);
        //print out sorted arrays
        System.out.print("Merge Sort: ");
        print(arrMerge);
        System.out.print("Quick Sort: ");
        print(arrQuick);
        System.out.print("Exchange Sort: ");
        print(arrExchange);
        System.out.print("Classical Matrix Multiplication: ");
        printMatrix(arrC);
        System.out.print("Strassen's Matrix Multiplication: ");
        printMatrix(arrS);
    }//end main
    //randomizes sorting algorithms
    public static void rand(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=(int)(Math.random()*100+1);// randomize
        }// end for
    }//end rand
    //randomizes matrix
    public static void randMatrix(int[][]a)
    {
        
        for(int i =0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=(int)(Math.random()*100+1);                
            }//end for
        }//end for
    }//end randMatrix
    //prints out array
    public static void print(int[] a)
    {
        for(int i:a)
        {
            System.out.print(i+" ");
        }//end for
        System.out.println();
    }//end print
    //prints out matrix
    public static void printMatrix(int [][] a)
    {
        System.out.println();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }//end for
            System.out.println();
        }//end for
    }//end print matrix
}
