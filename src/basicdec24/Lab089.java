package src.basicdec24;

public class Lab089 {
    public static void main(String[] args) {
       //Important
        int [] arr1={1,2,3,4};
        int [] arr2={1,2,3,4};
        System.out.println(arr1==arr2);//This is not equal//They are different location in memory.

        int [] arr3=arr1;
        System.out.println(arr1==arr3);//now they are equal
        System.out.println(arr1.equals(arr2));
        //If it is String the answer true because we are comparing value
        //In case of Arrays->we don't comparing value and reference not equal

        arr3[0]=25;
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);



    }
}
