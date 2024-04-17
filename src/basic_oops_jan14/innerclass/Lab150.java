package src.basic_oops_jan14.innerclass;

public class Lab150 {

    public static void main(String[] args) {
        OOC ooc = new OOC();
        OOC.SNCI icref= new OOC.SNCI();
        icref.show();

    }
}


class OOC{
    static  int o =100;
    int a = 900;

    static class SNCI{
        void show(){
            //System.out.println(a);// Not possible because state method and static variable all of have a problem in instance variable
            System.out.println(o);
        }
    }



}