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
class AnonymousArray
{
    public static void main(String[] args) 
    {
        calc obj = new calc();
        int result = obj.add(new int[]{1,2,3,4,5,6,7,8,9,10});
        System.out.println(result); // It prints addition of Arrays
        
    }
}