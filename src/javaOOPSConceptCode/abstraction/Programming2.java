package src.javaOOPSConceptCode.abstraction;


    abstract class Programming2 {//super class
        public abstract void Developer();
        public abstract void Rank2();

    }
    class  HTML1 extends Programming2 {
        @Override
        public void Developer(){
            System.out.println("Sanjay kumar Sahoo");
        }

        @Override
        public void Rank2(){
            System.out.println("3rd");
        }
    }
    abstract class Java1 extends Programming2{
        @Override
        public void Developer(){
            System.out.println("Beauty paul");
        }
    }
    class Main1{
        public static void main(String[] args) {
            HTML1 h = new HTML1();
            h.Developer();h.Rank2();

        }

}
