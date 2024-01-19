package src.basic_jan13.accessModifiers.police;

public class Cop {

public int gun;


public Cop(int gun){
this.gun=gun;

}

protected void canIShoot(){//if you change public to private,Cop only used this.
    // but if you change protected then all police classes are used
    System.out.println("Of-course,Shoot ");
}
}
