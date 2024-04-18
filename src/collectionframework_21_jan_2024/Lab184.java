package src.collectionframework_21_jan_2024;

import java.util.Enumeration;
import java.util.Vector;

public class Lab184 {
    public static void main(String[] args) {
        //Example of Enumeration
        Vector<String> v2 = new Vector();
        v2.add("pramod");
        v2.add("pr");
        v2.add("adsda"); // Array - can store simirlar only

        Enumeration e  = v2.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }


    }
}
