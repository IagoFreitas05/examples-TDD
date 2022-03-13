package domain;

public class Stack {
    private Object[] element = new Object[10];
    private int quantity = 0;

    public Stack(int i) {
    }

    public boolean isEmpty() {
        return (this.quantity == 0);
    }

    public int size() {
        return this.quantity;
    }

    public void stackUp(Object element) {
        this.element[this.quantity] = element;
        this.quantity++;
    }

    public String top() {
        return this.element[quantity - 1].toString();
    }

    public Object unstack() {
        Object top = top();
        this.quantity--;
        return top;
    }
}
