package src.collectionframework_3_feb_2024;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab191 {
    public static void main(String[] args) {
//Difference between HashSet,linkedHashSet,treeset
        Set courseSets = new HashSet();
        courseSets.add("ATB");
        courseSets.add("MTB");
        courseSets.add("LAPIT");
        courseSets.add("SDET Blueprint");
        courseSets.add("Java for Testers");

        System.out.println(courseSets);

       // Set courseSets = new LinkedHashSet();
       // courseSets.add("ATB");
       // courseSets.add("MTB");
       // courseSets.add("LAPIT");
       // courseSets.add("SDET Blueprint");
       // courseSets.add("Java for Testers");

        //System.out.println(courseSets);

       // Set courseSets = new TreeSet();
        //courseSets.add("ATB");
        //courseSets.add("MTB");
        //courseSets.add("LAPIT");
        //courseSets.add("SDET Blueprint");
        //courseSets.add("Java for Testers");

        //System.out.println(courseSets);

    }
}
