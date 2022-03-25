package domain;

import errors.EmptyStackExceptionStack;
import errors.StackOverflowStackError;

public class Stack {
    private Object[] element;
    private int quantity = 0;

    public Stack(int maximo) {
        this.element = new Object[maximo];
    }

    public boolean isEmpty() {
        return (this.quantity == 0);
    }

    public int size() {
        return this.quantity;
    }

    public void stackUp(Object element) {
        if (this.quantity == 10)
            throw new StackOverflowStackError("sua pilha está cheia");
        this.element[this.quantity] = element;
        this.quantity++;

    }

    public String top() {
        return this.element[quantity - 1].toString();
    }

    public Object unstack() {
        if (isEmpty())
            throw new EmptyStackExceptionStack("sua pilha está vazia");
        Object top = top();
        this.quantity--;
        return top;
    }
}
