package MoreJava.src;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.SimpleTimeZone;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> outList = new ArrayList<>();
//Adding values
        outList.add("Dmitry");
        System.out.println(outList);

        outList.add("Olga");
        System.out.println(outList);

        outList.add("Roman");
        System.out.println(outList);
//Reading (Getting) specific Array values
        System.out.println(outList.get(0));
//Changing specific values
        outList.set(0, "Alex");
        System.out.println(outList);
//Deleting specific values
        String removed = outList.remove(0); //Hover over remove. 'Returns element removed'. We can use that.
        System.out.println(outList);
        System.out.println(removed);
//Array Size
        outList.add("Romina");
        outList.add("Juan");
        outList.add("Pedro");
        outList.add("Francisco");
        outList.add("Villa");
//Array Size
        System.out.println("There are " + outList.size() + " items in the list");
//Check if Array contains specific values
        System.out.println(outList + " contains Juan " + outList.contains("Juan"));
        System.out.println(outList + " contains Pedro " + outList.contains("Pedro"));
//Obtain index of a value
        System.out.println("Index of 'Olga' is: " + outList.indexOf("Olga"));
        System.out.println("Is empty: " + outList.isEmpty());
//Print the Array as List
        System.out.println("- - - - - - - ");
        for (String value : outList) {
            System.out.println(value);
        }

        System.out.println("- - - - - - - ");

//Itareator
        Iterator<String> iterator = outList.iterator();

        String name = iterator.next(); //The first time we use Iteratos, we get first array value
        System.out.println("Name is: " + name);

        name = iterator.next(); //Second time, second value, and so on.
        System.out.println("Second name is: " + name);

    }
}
