/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ds;

import java.util.HashMap;

/**
 *
 * @author eslam
 */
public class Queue<T> {

    LinkedList<T> queue; 
    public Queue() {
        queue = new LinkedList<>();
    }

    public void enQueue(T Value) {
        queue.addLast(Value);
    }

    public T deQueue() {
        T Value = peek();
        queue.removeFirst();
        return Value;
    }

    public T peek() {
        return queue.getfirst();
    }

    public void diplayAll() {
        queue.printFromFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
    public int getSize(){
        return queue.getSize();
    }
}
