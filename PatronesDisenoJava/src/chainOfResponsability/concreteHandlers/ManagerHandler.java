package chainOfResponsability.concreteHandlers;

import chainOfResponsability.Handler;
import chainOfResponsability.Request;
public class ManagerHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getSeverity() <= 3) {
            System.out.println("Manager is handling request: " + request.getDescription());
        } else {
            System.out.println("Request: " + request.getDescription() + " is too severe and cannot be handled");
        }
    }
}
