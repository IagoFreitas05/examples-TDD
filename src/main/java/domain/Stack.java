package domain;

public class Stack {
    private Object element;
    private int quantity;

    public Stack(int i) {
    }

    public boolean isEmpty() {
        return (this.element == null);
    }

    public int size() {
        return this.quantity;
    }

    public void stackUp(Object element) {
        this.element = element;
        this.quantity++;
    }

    public String top() {
        return this.element.toString();
    }
}
