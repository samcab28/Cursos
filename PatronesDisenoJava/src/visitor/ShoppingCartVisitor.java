package visitor;

import visitor.concreteElements.Fruit;
import visitor.concreteElements.Book;


class ShoppingCartVisitor implements Visitor {
    public void visit(Book book) {
        System.out.println("Book ISBN::" + book.getIsbnNumber() + " cost = $" + book.getPrice());
    }

    public void visit(Fruit fruit) {
        System.out.println(fruit.getName() + " cost = $" + fruit.getPricePerKg() + " per kg, Total Cost = $" + (fruit.getPricePerKg() * fruit.getWeight()));
    }
}

