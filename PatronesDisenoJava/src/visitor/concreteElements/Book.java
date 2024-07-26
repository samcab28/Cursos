package visitor.concreteElements;

import visitor.ItemElement;
import visitor.Visitor;

public class Book implements ItemElement {
    private double price;
    private String isbnNumber;

    public Book(double price, String isbnNumber) {
        this.price = price;
        this.isbnNumber = isbnNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
