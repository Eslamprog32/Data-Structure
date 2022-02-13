/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ds;

/**
 *
 * @author eslam
 */
public class Stack<T> {

    private final LinkedList<T> stack;

    public Stack() {
        stack = new LinkedList<>();
    }

    public void push(T Value) {
        stack.addLast(Value);
    }

    public T pop() {
        T Value = peek();
        stack.removeLast();
        return Value;
    }

    public T peek() {
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void remove() {
        stack.removeLast();
    }

    public int size() {
        return stack.getSize();
    }

    public void diplayAll() {
        stack.printFromLast();
    }
}
