package decorator;

// Decorator Class
public class CarDecorator implements Car {
    protected Car decoratedCar;

    public CarDecorator(Car c) {
        this.decoratedCar = c;
    }

    @Override
    public void assemble() {
        this.decoratedCar.assemble();
    }
}

