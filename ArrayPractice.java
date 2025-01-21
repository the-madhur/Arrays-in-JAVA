public class ArrayPractice 
{
    public static void main(String[] args) 
    {
        // int nums[] = new int[4];
        // nums[0] = 1;
        // nums[1] = 8;
        // nums[2] = 7;
        // nums[3] = 6;
        
         char names[] = {'a','e','i','o'};

        //  for(char n : names)
        // {
        //     System.out.println(n);
        // }    

        // int nums[][] = new int[4][3];
        // nums[0][0] = 15;
        // nums[0][1] = 14;
        // nums[0][2] = 8;
        // nums[1][0] = 13;
        // nums[1][1] = 12;
        // nums[1][2] = 9;
        // nums[2][0] = 11;
        // nums[2][1] = 10;
        // nums[2][2] = 78;
        // nums[3][0] = 20;
        // nums[3][1] = 19;
        // nums[3][2] = 34;


        // for(int i =0;i<=3;i++)
        // {
        //     for(int j =0;j<=2;j++)
        //     {
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        // int arr[][] = {
        //                  {3,4,5},
        //                  {2,5,6},
        //                  {9,8,7}
        //               };
        // for(int i =0;i<=2;i++)
        // {
        //     for(int j =0;j<=2;j++)
        //     {
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        // }           
        
        // JAGGED ARRAY

        // int ar[][] ={
        //               {2,3,4,5},
        //               {7,8},
        //               {5,6,7}
        //             };
        
        // for(int i= 0;i<=2;i++)
        // {
        //     for(int j=0;j<ar[i].length;j++)
        //     {
        //         System.out.print(ar[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        int ary[][] = new int[3][];
        ary[0] = new int[4];
        ary[1] = new int[2];
        ary[2] = new int[3];

        ary[0][0] = 6;
        ary[0][1] = 59;
        ary[0][2] = 58;
        ary[0][3] = 57;
        ary[1][0] = 56;
        ary[1][1] = 5;
        ary[2][0] = 50;
        ary[2][1] = 51;
        ary[2][2] = 52;

        // for(int i =0;i<=2;i++)
        // {
        //     for(int j =0;j<ary[i].length;j++)
        //     {
        //         System.out.print(ary[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for(int a[] : ary)
        {
            for(int b: a)
            {
                System.out.print(b + " ");
            }
        }    
    }
    
}
