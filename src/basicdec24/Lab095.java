package src.basicdec24;

public class Lab095 {
    public static void main(String[] args) {
        //Arrays
        int [] marks = new int[4];
        marks[0]=89;
        marks[1]=67;
        marks[2]=45;
        marks[3]=100;


//This is called (1D) one dimensional arrays
       // 1D -> It is go for one direction.
        int i =0;
        while (i< marks.length) {
            System.out.println(marks[i]);
            i++;
        }
        System.out.println("_ End of program _");
    }
}
