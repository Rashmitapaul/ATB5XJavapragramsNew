package src.arraysAllCode;

public class Array2D {
    public static void main(String[] args) {
        int [][] arr=new int[3][3];
        //How to store the value in 2D Arrays
        // Row 0 to 2
        arr[0][0]=12;
        arr[0][1]=34;
        arr[0][2]=34;

        //initialized 2nd array /2bd row
        arr[1][0]=21;
        arr[1][1]=32;
        arr[1][2]=23;
        //initialized 3rd array / 3rd row
        arr[2][0]=31;
        arr[2][1]=32;
        arr[2][2]=33;
        // for (int i = 0; i < arr.length; i++) {
        //for (int j = 0; j < arr.length; j++) {
        // System.out.println(arr[i][j]);

        //  }
        //  System.out.println("");
        //  }

//You can see metrics if add "\t"
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + "\t");

            }
            System.out.println("");
        }




    }

}
