import java.util.ArrayList;
import java.util.List;

public class ArrayListCollection1 
{
    public static void main(String[] args) 
    {
        ArrayList al1 = new ArrayList();

        al1.add(100);
        al1.add(200);
        al1.add(300);

        // Inbuilt Methods

        //  1. contains

        System.out.println(al1.contains(200));

        //  2. indexOf

        int index = al1.indexOf(300);
        //System.out.println(index);
        System.out.println(al1.indexOf(300));

        //   3. Size

        System.out.println(al1.size());

        //   4. ensureCapacity

        al1.ensureCapacity(10);

        //  5. trimToSize

        al1.trimToSize();
        System.out.println(al1.size());

        //  6. clear
        
        al1.clear();
        System.out.println(al1);

        //  7. in Collection for Child type object we can also make Parent type Reference

        List al = new ArrayList();

        al.add(100);
        System.out.println(al);

    }   
}
