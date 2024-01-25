package src.basic_jan13.abstraction.interfaces.interviewquestion;

public class RC2 {

}

class lusy implements Rashmi{

   @Override
   public void math() {
      
   }
}
//interface Rashmi {
    //Rashmi() {//not possible
   // }
//}

interface Rashmi extends course{
   void math();
//Rashmi() {//not possible
   // }

}
interface course{
   void math();
}