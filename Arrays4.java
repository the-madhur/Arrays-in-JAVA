//                  For-each / Enhanced Loop use in Array

// It also works for JAGGED ARRAYS because there is no range we can set for row and column
public class Arrays4 
{
    public static void main(String[] args) 
    {
        /* Syntax - for(data_type variable:array) */

        // For 1-D Array Print

        int nums[] = {5,4,7,3};

        for(int n : nums)
        {
            System.out.print(n + " ");
        }
        System.out.println();

        // For 2-D Array Print
        
        int num[][] ={
                        {5,4,2,1},
                        {6,7,8,9},
                        {99,87,34,11}

                     };
        for(int a[] : num)
        {
            for(int b : a)
            {
                System.out.print(b+ " ");
            }
            System.out.println();
        }

        
    }
}
