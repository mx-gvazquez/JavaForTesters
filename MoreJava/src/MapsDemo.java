package MoreJava.src;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> age = new HashMap<>();
        age.put("Dmitry", 33);
        age.put("Olga", 29);
        age.put("Roman", 4);
//Print all pairs
        System.out.println(age);
        System.out.println("- - - - - - - ");
//Print a specific pair from array.
        System.out.println("Age of Dmitry es " + age.get("Dmitry"));
        System.out.println("- - - - - - - ");
//Print all keys.
        System.out.println("All keys: " + age.keySet());    //Only Key
        System.out.println("All values: " + age.values());  //Only Value
        System.out.println("All pairs: " + age.entrySet()); //Pair 'Key - Value'
        System.out.println("- - - - - - - ");
//Change values of a key.
        age.replace("Dmitry",34);
        System.out.println(age);
        System.out.println("- - - - - - - ");
//Remove pair
        age.remove("Olga");
        System.out.println(age);

        System.out.println("- - - - - - - ");

// Iterator
        Iterator iterator = age.entrySet().iterator();
        while (iterator.hasNext()){
            System.out.println("Entry set: " + iterator.next());
        }

        /*  //Modern wey suggested bu IntelliJ
              for (Map.Entry<String, Integer> stringIntegerEntry : age.entrySet()) {
            System.out.println("Entry set: " + stringIntegerEntry);
        }
         */

        System.out.println("- - - - - - - ");

//Access Key & Value separately.
        Iterator<Map.Entry<String, Integer>> iterator2 = age.entrySet().iterator();
        while (iterator2.hasNext()){
            Map.Entry<String, Integer> entry = iterator2.next();
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
        System.out.println("- - - - - - - Easier way");

        for (Map.Entry<String, Integer> entry : age.entrySet()){
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }



    }
}
