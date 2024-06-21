package src.javaOOPSConceptCode.abstraction;


    abstract class Programming3 {//super class
        public abstract void Dev();
        public abstract void Ranks();

    }
   abstract class  HTML2 extends Programming3 {
        @Override
        public void Dev(){
            System.out.println("Sanjay  Sahoo");
        }


    }
    class Java2 extends HTML2 {
        @Override
        public void Ranks(){
            System.out.println("2rd");
        }
    }
    class Main2{
        public static void main(String[] args) {
                Programming3 a = new Java2();
                a.Dev();a.Ranks();




        }
}
