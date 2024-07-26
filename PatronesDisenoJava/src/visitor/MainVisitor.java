package visitor;

import visitor.concreteElements.Fruit;
import visitor.concreteElements.Book;


public class MainVisitor {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[] {
                new Book(20.99, "1234"),
                new Book(15.49, "5678"),
                new Fruit(2.99, 2.0, "Apple"),
                new Fruit(3.49, 1.5, "Banana")
        };

        Visitor visitor = new ShoppingCartVisitor();
        for (ItemElement item : items) {
            item.accept(visitor);
        }
    }
}
