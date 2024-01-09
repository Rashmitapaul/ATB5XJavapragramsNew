package src.basicdec23;

public class Lab072 {
    public static void main(String[] args) {
        //Continue -> if this true
        for (int i = 0; i < 10; i++) {// 10 times, i ->0 to 9
            System.out.println(i);//Debug this
            if (i==5)continue;//after 5 move back to line no 6 not execute because of line number 9
            System.out.println("AFTER");
            
        }
    }
}
