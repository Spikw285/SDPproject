// src/state/OrderState.java
package state;

public interface OrderState {
    void next(OrderContext context);
    void previous(OrderContext context);
    void printStatus();
}
