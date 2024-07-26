package visitor;

import visitor.concreteElements.Book;
import visitor.concreteElements.Fruit;

public interface Visitor {
    void visit(Book book);
    void visit(Fruit fruit);
}
