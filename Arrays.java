//                               1 Dimensional Array

public class Arrays 
{
    public static void main(String[] args) 
    {
        int num[] = {12,13,14,56};
        
        System.out.println(num[0]);  // O/P= 12 for printing one one element of array
        
        for(int i=0;i<=3;i++)
        {
            System.out.println(num[i]);
        }

        // If we assign values for array

        int nums[] = new int[4];
        nums[0] = 14;
        nums[1] = 88;
        nums[2] = 98;
        nums[3] = 58;

        for(int i =0;i<=3;i++)
        {
          System.out.println(nums[i]);
        }

        // If String Array

        String names[] = {"Madhur","Anant","Varun","Ayush","Hirday"};
        for(int i =0;i<=4;i++)
        {
            System.out.println(names[i]);
        }

        // Assign String Values

        String name[] = new String[3];
        name[0] = "Harsh";
        name[1] = "Jay";
        name[2] = "Mayank";
        
        for(int i = 0;i<=2;i++)
        {
            System.out.println(name[i]);
        }
    }
    
}
