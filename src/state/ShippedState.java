package state;

public class ShippedState implements OrderState {

    @Override
    public void next(OrderContext context) {
        context.setState(new DeliveredState()); // Transition to next state
    }

    @Override
    public void previous(OrderContext context) {
        context.setState(new CreatedState()); // Revert to previous state
    }

    @Override
    public void printStatus() {
        System.out.println("Order is shipped.");
    }
}
