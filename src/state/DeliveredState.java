package state;

public class DeliveredState implements OrderState {

    @Override
    public void next(OrderContext context) {
        System.out.println("This is the final state, can't go forward.");
    }

    @Override
    public void previous(OrderContext context) {
        context.setState(new ShippedState()); // Revert to previous state
    }

    @Override
    public void printStatus() {
        System.out.println("Order is delivered.");
    }
}
