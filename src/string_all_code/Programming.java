package src.string_all_code;

public class Programming {
    public static void main(String[] args) {
        //This is the  more simple process for reverse in Lab118
        String name ="'sd,sa@An!";
        String y ="";
        for (int i = name.length()-1; i >= 0 ; i--) {
            y = y + name.charAt(i);

        }

        System.out.println(y);
        
    }
}
//Input :'sd,sa@An!
   //     Output :'nA, as@ds!'