package src.oops_21_jan_2024.collectionframwork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab179 {
    public static <object> void main(String[] args) {
        List <String>mylist = new ArrayList<>();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add("Dutta");
      // mylist.add(123);//when you add string in list give error
      // mylist.add(true);

        System.out.println(mylist);
        mylist.set(1,"Yak");
        System.out.println(mylist);
        mylist.remove("Yak");
        System.out.println(mylist);

        System.out.println(" --- ");
//This is the 3 way to print the list

        // For Loop
        for (int i = 0; i < mylist.size() ; i++) {
            System.out.println(mylist.get(i));
        }

        System.out.println(" --- ");

        // For Each Loop

        for(String o :mylist){
            System.out.println(o);
        }

        System.out.println(" --- ");


        // Iterator
        Iterator iterator = mylist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }



    }
}