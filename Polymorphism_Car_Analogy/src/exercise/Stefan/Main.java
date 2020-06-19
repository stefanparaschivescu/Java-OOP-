package exercise.Stefan;

class Car {
    private boolean enginge;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.enginge = true;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine ()
    {
        System.out.println("Car.startEngine() has beem called");
    }

    public void accelerate()
    {
        System.out.println("Car.accelerate() has been called");
    }

    public void brake()
    {
        System.out.println("Car.break() has been called");
    }

}

class e208 extends Car {


    public e208() {
        super(0, "e208");
    }

    @Override
    public void startEngine() {
        super.startEngine();
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

class eCorsa extends Car {


    public eCorsa() {
        super(0, "eCorsa");
    }

    @Override
    public void startEngine() {
        System.out.println("eCorsa.startEngine has been called");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("eCorsa.accelerate has been called");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.println("eCorsa.break has been called");
        super.brake();
    }
}

class Megane extends Car {


    public Megane() {
        super(4, "Megane");
    }

    @Override
    public void startEngine() {
        System.out.println("Megane.startEngine has been called");
        super.startEngine();
    }

    @Override
    public void accelerate() {
        System.out.println("Megane.accelerate has been called");
        super.accelerate();
    }

    @Override
    public void brake() {
        System.out.println("Megane.brake has been called");
        super.brake();
    }
}


public class Main {

    public static void main(String[] args) {

        for (int i=1; i< 6; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i + " is " + car.getName());
            car.startEngine();
           // System.out.println("\n");
            car.accelerate();
            //System.out.println("\n");
            car.brake();
            System.out.println("\n");

                    }

    }


    public static Car randomCar () {
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Your generated number is " + randomNumber);
        switch (randomNumber) {
            case 1: return new e208();
            case 2: return new eCorsa();
            case 3:return new Megane();
        }

        return null;

    }
}
