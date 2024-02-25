// -------------------length vs length()-----------------------

// length -----> It is a property of Array
// length() ---> It is a method of String 
// Both can be use for Knowing the length


public class Array5 
{
    public static void main(String[] args) 
    {
        //-----------length--------------

        //   ARRAY LENGTH FIND
            // SYntax : array_name.length

        // int nums[]= {2,3,4,5};
        // System.out.println(nums.length);

        int num[][] ={
                        {23,45,65,78},
                        {34,65,66},
                        {21,1}
                     };

        System.out.println(num.length); // It gives length of Big Array Elements inside SO o/p = 3
        System.out.println(num[0].length);
        System.out.println(num[1].length);
        System.out.println(num[2].length);


        //-------------length()---------------

        String name = "Madhur";
        System.out.println(name.length());
        

    }
    
}
