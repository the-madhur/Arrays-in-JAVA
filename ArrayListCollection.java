// Collection framework ----------- Collection Hierarchy
import java.util.*;

public class ArrayListCollection
{
    public static void main(String[] args) 
    {
        // Array List--------------------------

        ArrayList al1 = new ArrayList();
        al1.add(100);
        al1.add(200);
        al1.add(300);

        System.out.println(al1);
        
        System.out.println("**********************************************");

        //   1. It stores mix type of data

        ArrayList al2 = new ArrayList();
        al2.add("PW Skills");  // String type
        al2.add('M');          // Character type
        al2.add(2);            // Integer type

        System.out.println(al2);

        //  2. There is no size fix ,, It is dynamic in nature

        al2.add(100);
        System.out.println(al2);

        System.out.println("**********************************************");

        //  3. We can also add or store one collection in another

        ArrayList al3 = new ArrayList();
        al3.add(1);
        al3.add(2);
        al3.add(4);

        System.out.println(al3);

        System.out.println("After adding Collection");

        al3.addAll(al2);
        System.out.println(al3);

        System.out.println("**********************************************");
        
        //  4. we can also store info/data in specific index but it is not recommended in Array List it is recommended to use this in Linked List

        System.out.println(al3);

                // after adding in specific index

        al3.add(2,"PW");

        System.out.println("After adding in specific index");
        System.out.println(al3);

        //  5. In same order you store data so when you retrieve it is also in same order 

        ArrayList al4 = new ArrayList();

        al4.add(1);
        al4.add(2);
        al4.add(9);

        System.out.println(al4);

        System.out.println("******************************************************");

        //  6. Duplicates also allowed in Array List
        
        System.out.println(al4);   // al4 also contains 1 but we also add 1 so it shows it also stores duplicate

        al4.add(1);

        System.out.println(al4);


        
    }
}