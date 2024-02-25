//                    JAGGED ARRAYS
public class Arrays3 
{
    public static void main(String[] args) 
    {
        // JAGGED ARRAYS - It is the type of arrays where values of rows are fixed but the values of columns are not fixed

        // for example

        // int nums[][] = {
        //                   {5,3,4,1},   // 1st Row having 4 values
        //                   {8,9},       // 2nd Row having 2 values
        //                   {6,2,7}      // 3rd Row having 3 values
        //                };
        // // How we can print this Arrays 
        // // so here we use --> <array_name[row value variable].length
        // // this use for asking the value from array for columns
        
        // for(int i=0;i<=2; i++ ) 
        // {
        //     for(int j=0;j<nums[i].length;j++)
        //     {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        //but if we assign values for Arrays so how it can possible
        // It means in this Syntax 

        int nums[][] = new int[3][];
        nums[0]= new int[4];   // Here rows tells Size of columns for ex Row [0] tells [4] values in columns so 
        nums[1]= new int[2];
        nums[2]= new int[3];

        // then we Give values for Array

        nums[0][0] = 5;     // 0 Row having 4 Columns so here 4 values
        nums[0][1] = 2;
        nums[0][2] = 3;
        nums[0][3] = 4;
        nums[1][0] = 6;    // 1 Row having 2 Columns so here 2 values
        nums[1][1] = 7;
        nums[2][0] = 8;    // 2 Row having 3 Columns so here 3 values
        nums[2][1] = 9;
        nums[2][2] = 10;

        for(int i=0;i<=2; i++ ) 
        {
            for(int j=0;j<nums[i].length;j++)
            {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }


    }
    
}
