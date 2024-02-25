//                      2D Arrays
public class Array2 
{
    public static void main(String[] args) 
    {
        // We assign 2D Array

        // int nums[][] = new int [3][2];
        // nums[0][0]= 5;
        // nums[0][1]= 4;
        // nums[1][0]= 3;
        // nums[1][1]= 6;
        // nums[2][0]= 1;
        // nums[2][1]= 2;

        // for printing 2D Array we use Nested loop concept

        // for values if assigns already 
        
        int nums[][] = {
                          {5,4},
                          {6,3},
                          {2,1}
                       };


        for(int i =0;i<=2;i++) //here i represents ROWS
        {
            for(int j =0;j<=1;j++) // here j represents COLUMNS 
            {
                System.out.print(nums[i][j] + " ");   // here we use print so rows values in row
            }
            System.out.println();
        }


    }

    
}
