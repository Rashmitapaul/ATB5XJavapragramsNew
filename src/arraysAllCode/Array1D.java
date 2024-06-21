package src.arraysAllCode;

public class Array1D {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        int[] arr2={1,2,3,4,5};
        System.out.println(arr1==arr2);
        //They are not equal because memory location is different
        int[] arr3=arr1;
        System.out.println(arr1==arr3);//now they are equal

        System.out.println(arr1.equals(arr2));
        //If it is String the answer true because we are comparing value
        //In case of Arrays->we don't comparing value and reference not equal

        arr3[0]=15;
        System.out.println(arr1[0]);
        System.out.println(arr3[0]);

    }
}
