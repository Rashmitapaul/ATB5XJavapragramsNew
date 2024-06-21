package src.javaOOPSConceptCode.polymorphism;
//METHOD OVERLOADING
class ClassA {
    int add(){//method doesn't have any connection for return type
        int a = 10;int b = 20;
        int c= a+b;
        return c;
    }
    void add(float x, float y){//same name 3 method create is called method overloading

        float c= x+y;
        System.out.println(c);
    }
    void add(int x,int y){//int x,int y this is the parameter we can pass through method

        int c= x+y;
        System.out.println(c);
    }
    void add(int x,double y){//same name different parameter used

        double c= x+y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        ClassA r=new ClassA();
       r.add(43.2f,20.12f);
        r.add(11,22);
        r.add(50,45.32);
        int add =r.add();
        System.out.println(add);

    }
}
