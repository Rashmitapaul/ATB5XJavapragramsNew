package src.basicdec23;

public class Lab069 {
    public static void main(String[] args) {
        //For Loop
        //for(A;B;C)
        //A->initialization -->JVM what variable, where you are starting point
        //B->Condition->when you want this  to stop
        //C->increment/decrement


      //Print the odd number in between the 1 to 50
        //in this case we use if else
        for (int i = 1; i <=50 ; i++) {
            if (i%2==1){
                System.out.println(i + " is odd!");
            }

        }
        for (int i = 50; i >0  ; i--) {
            if (i%2==1){
                System.out.println(i + " is odd!");
            }

        }
        for (int i = 1; i <=50 ; i++) {//(int i = 0; i <=50 ; i++) in thia case (i%2==0)
            if (!(i%2==1)){// (!(i%2==1)) or (i%2==0)
                System.out.println(i + " is even!");
            }

        }
        for (int i = 50; i >0  ; i--) {
            if (!(i%2==1)){
                System.out.println(i + " is even!");
            }

        }

        System.out.println("End of  program");






    }
}
