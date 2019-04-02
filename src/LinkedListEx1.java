import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListEx1
{
    public static void main(String[] args)
    {
        //exercise i)
        LinkedList<String> names = new LinkedList<String>();
        names.addLast("Kay");
        names.addLast("Jay");
        names.addLast("May");
        names.addLast("Fay");

        ListIterator<String> iterator = names.listIterator();

        iterator.next();    // K|JMF
        iterator.next();    // KJ|MF
        iterator.next();    // KJM|F
        //exercise ii)
        iterator.add("Ray");        //KJMR|F

        iterator.previous();        //KJM|RF
        iterator.previous();        //KJ|MRF
        iterator.previous();        //K|JMRF
        //exercise iii)
        iterator.remove();          //K|MRF     Remove takes out the last traversed element

        System.out.println(names);

        System.out.println("\n\n\nExpected: [Kay, May, Ray, Fay]\nOrder forward");


        //exercise iv)
        iterator = names.listIterator();
        while (iterator.hasNext())
        {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("\n\n\nExpected: [Fay, Ray, May, Kay]\nOrder in reverse");

        ListIterator<String> namesv2 = names.listIterator(names.size());

        while(namesv2.hasPrevious())
        {
            System.out.println("" + namesv2.previous());
        }

    }
}
