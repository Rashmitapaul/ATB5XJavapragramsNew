package src.basicdec23;

public class Lab066 {
    public static void main(String[] args) {

            //for(A;B;C)
            //A->initialization -->JVM what variable, where you are starting point
            //B->Condition->when you want this  to stop
            //C->increment/decrement
            System.out.println("Print the value of i, but i want break when i=5");
            for (int i = 1; i < 10; i++) {//debug this
                System.out.println("Value of " + i);
                if(i==5) {
                    break;


                }
            }
            System.out.println("END");





        }
    }


