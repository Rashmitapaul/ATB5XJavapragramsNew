package src.collectionframework_21_jan_2024;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab183 {
    public static void main(String[] args) {


        List ttacourseList = new ArrayList();
        ttacourseList.add("ATB");
        ttacourseList.add("MTB");
        ttacourseList.add("LAPIT");
        ttacourseList.add("SDET Blueprint");
        ttacourseList.add("Java for Testers");


        ListIterator lt = ttacourseList.listIterator();//it will give forward direction
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }

        System.out.println(" --- ");


//        ListIterator lt2 = ttacourseList.listIterator(ttacourseList.size());//This is give reverse
//        while (lt2.hasPrevious()) {
//            System.out.println(lt2.previous());
//        }


    }
}