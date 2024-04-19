package src.collectionframework_3_feb_2024;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab190 {
    public static void main(String[] args) {

        Set courseSets = new HashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");
      //How you can print this by using for each loop an iterator
        System.out.println(courseSets);
        for (Object o : courseSets) {
            System.out.println(o);
        }


        Iterator it = courseSets.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }





    }
}
