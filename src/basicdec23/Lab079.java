package src.basicdec23;

public class Lab079 {
    public static void main(String[] args) {
        //If you want  initialization inside use for loop
      //  for (int j = 1; j <= 10; j=j+1) {

          //  System.out.println(j);

       // }
       // System.out.println(j);

        //If you want  initialization outside use while loop
        int i=10;//A->initialization
        while (i > 10){//B-> Condition//output not printed
            System.out.println(i);//D-> code execution
            i++;//C->Increment and decrement
        }
        System.out.println(i);
    }
}
