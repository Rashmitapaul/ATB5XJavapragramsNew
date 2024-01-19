package src.basic_jan13.accessModifiers.criminal;

import src.basic_jan13.accessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {
        Cop c =new Cop(10);
        System.out.println(c.gun);

        //c.canIShoot();//when you change public to private this is not possible
//He is not protect police folder.
    }
}
