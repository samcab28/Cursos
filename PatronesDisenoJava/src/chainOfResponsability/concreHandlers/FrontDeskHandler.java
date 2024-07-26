package chainOfResponsability.concreHandlers;

import chainOfResponsability.Handler;
import chainOfResponsability.Request;

public class FrontDeskHandler implements Handler {
    private Handler nextHandler;

    @Override
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(Request request) {
        if (request.getSeverity() <= 1) {
            System.out.println("Front Desk is handling request: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}