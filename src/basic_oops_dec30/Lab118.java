package src.basic_oops_dec30;

public class Lab118 {
    public static void main(String[] args) {
        String name = "Rashmi";
        char [] charArray = name.toCharArray();
        System.out.println(charArray.length);
        //o/p should be imhsaR
        int left = 0;
        int right =charArray.length-1;

        while (left < right){
            char temp = charArray[left];
            charArray[left] = charArray[right];
            //This is the swap condition
            charArray[right] = temp;

            left++;
            right--;

        }

        String rev_name = new String(charArray);// After this name come from reverse
        System.out.println(rev_name );
    }
}
