class calc
{
    public int add(int nums[])
    {
        int result = 0;
        for(int n: nums)
        {
            result = result + n;
        }
        return result;
        
    }
}
public class AnonymousArray 
{
    public static void main(String[] args) 
    {
        calc obj = new calc();
        int result = obj.add(new int[]{1,2,3,4});
        System.out.println(result);

        
    }
    
}
