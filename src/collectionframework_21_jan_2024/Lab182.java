package src.collectionframework_21_jan_2024;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab182 {
    public static void main(String[] args) {
        List<String> courseList = new ArrayList<>();
        //ArrayList<String> courseList = new ArrayList<>();// this is also possible
        courseList.add("ATB");
        courseList.add("MTB");
        courseList.add("PyATB");
        courseList.add("LAPIB");
        courseList.add("SDET Blueprint");

        List numList = new ArrayList();
       // List<Integer> numList = new ArrayList();//Here not supported primitive data type but you use wrapper type
        numList.add(150);
        numList.add(100);
        numList.add(100);
        numList.add(399);

        courseList.addAll(numList);//addAll method add everything
        System.out.println(courseList);


        Iterator iterator = courseList.iterator();
        while(iterator.hasNext()){
//            courseList.add("GEN AI");
            System.out.println(iterator.next());
        }







    }
}
