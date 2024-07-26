package mediator;

public class MediatorMain {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatRoom();

        User user1 = new ConcreteUser(mediator, "John");
        User user2 = new ConcreteUser(mediator, "Jane");
        User user3 = new ConcreteUser(mediator, "Doe");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);

        user1.send("Hello everyone!");
        user2.send("Hi, How are you John, I'm good today");
    }
}
