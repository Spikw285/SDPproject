// src/state/CreatedState.java
package state;

public class CreatedState implements OrderState {

    @Override
    public void next(OrderContext context) {
        context.setState(new ShippedState()); // Transition into next state
    }

    @Override
    public void previous(OrderContext context) {
        System.out.println("This is the initial state, can't go back.");
    }

    @Override
    public void printStatus() {
        System.out.println("Order is created.");
    }
}
