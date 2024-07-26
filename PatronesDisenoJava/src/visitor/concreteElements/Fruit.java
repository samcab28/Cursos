package visitor.concreteElements;

import visitor.ItemElement;
import visitor.Visitor;

public class Fruit implements ItemElement {
    private double pricePerKg;
    private double weight;
    private String name;

    public Fruit(double pricePerKg, double weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

    public double getPricePerKg() {
        return pricePerKg;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
