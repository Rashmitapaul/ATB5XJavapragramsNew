package src.oops_21_jan_2024.collectionframwork;

import java.util.ArrayList;
import java.util.List;

public class Lab178{
    public static void main(String[] args) {
//        List mylist = new List();
        List mylist = new ArrayList();
        mylist.add("Pramod");
        mylist.add("Amit");
        mylist.add(123);
        mylist.add(true);

        System.out.println(mylist);
        mylist.set(1,"Yak");
        System.out.println(mylist);
        mylist.remove("Yak");
        System.out.println(mylist);


        for (int i = 0; i < mylist.size() ; i++) {
            System.out.println(mylist.get(i));
        }

        for(Object o :mylist){
            System.out.println(o);
        }



    }

}
