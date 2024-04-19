package src.collectionframework_3_feb_2024;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Lab195 {
    public static void main(String[] args) {

        Queue integerQueue = new PriorityQueue<>();
        //Queue<Integer> integerQueue = new PriorityQueue<>();
        //If you use Integer dimand operator you can't take the value A,B OR C OR NAME
        integerQueue.add("A");
        integerQueue.add("B");
        integerQueue.add("C");
        System.out.println(integerQueue);
        integerQueue.poll();
        System.out.println(integerQueue);

        Iterator iterator = integerQueue.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }


    }
}
