package decorator;

import decorator.concreteDecorator.LuxuryCar;
import decorator.concreteDecorator.SportsCar;

public class MainDecorator {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n-----");

        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
