import java.util.ArrayDeque;

public class ArrayDequeColletion 
{
    public static void main(String[] args) 
    {
        ArrayDeque ad1 = new ArrayDeque();

        ad1.add(100);
        ad1.add(200);
        ad1.add(200);

        System.out.println(ad1);

        ad1.addFirst(10000);
        ad1.addLast(900);

        System.out.println(ad1);

        ad1.add("Pw");
        System.out.println(ad1);

        // offer method may add or reject the data 
        ad1.offer(500);
        ad1.offerFirst(10);
        ad1.offerLast(1);

        System.out.println(ad1);

        
    }
    
}
