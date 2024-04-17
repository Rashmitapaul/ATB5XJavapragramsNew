package src.basic_oops_jan14.innerclass;

public class Lab149 {
    public static void main(String[] args) {
        Car c = new Car("Lamborghini");

        Car.Engine engine = c.new Engine("400CC");
        engine.start();
        c.drive();
    }
}

    class Car {
        String make;//Instance variable

        // parameterized constructor
        public Car(String make) {
            this.make = make;
        }
            //Method
            void drive () {
                System.out.println("You can drive car");


        }


        public class Engine {//All are hidden in this case
            //Instance variable
            String hoursePower;

            // parameterized constructor
            public Engine(String hoursePower) {
                this.hoursePower = hoursePower;
            }

            //Method
            void start() {
                System.out.println("Engine is started ->" + make);
            }
        }
    }
