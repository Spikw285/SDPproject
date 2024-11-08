// src/state/OrderContext.java
package state;

public class OrderContext {
    private OrderState currentState;

    public OrderContext() {
        currentState = new CreatedState(); // Original state
    }

    public void setState(OrderState state) {
        currentState = state;
    }

    public void next() {
        currentState.next(this); // Transferring different context
    }

    public void previous() {
        currentState.previous(this);
    }

    public void printStatus() {
        currentState.printStatus();
    }
}
