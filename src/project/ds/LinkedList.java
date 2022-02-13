/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ds;

/**
 *
 * @author eslam
 * @param <T>
 */
public class LinkedList<T> {

    private Node<T> first;
    private Node<T> last;
    private int size;
    public LinkedList() {
        size = 0;
    }
    
// This Function to add last  with Time Complexity O(1)
     // 0 1 2 3 4
    public void addLast(T Value) {
        if (isEmpty()) {
            first = new Node<>(Value);
            last = first;
        } else {
            Node<T> n = new Node<>(Value);
            last.setNextNode(n);
            n.setPreviousNode(last);
            last = n;
        }
        size++;
    }
// This Function to add first  with Time Complexity O(1)
   // 0 1 2 3 
    public void addFirst(T Value) {
        if (first == null) {
            first = new Node<>(Value);
            last = first;
        } else {
            Node<T> n = new Node<>(Value);
            n.setNextNode(first);
            first.setPreviousNode(n);
            first = n;
        }
        size++;
    }
// This Function to insert Elements with Time Complexity O(n)

    public void insert(T Value, int index) {
        index = Math.min(index, size);
        Node<T> ne = new Node<>(Value);
        if (index == 0) {
            addFirst(Value);
        } else if (index == size) {
            addLast(Value);
        } else {
            Node n = first;
            for (int i = 0; i < index; i++) {
                n = n.getNextNode();
            }
            ne.setNextNode(n);
            n.getPreviousNode().setNextNode(ne);
            size++;
        }
        
    }
// This Function to remove each Element with Time Complexity O(n)

    public boolean remove(int index) {
        if ((index + 1) > size) {
            return false;
        }
        if (index == 0) {
            removeFirst();
        } else if ((index + 1) == size) {
            removeLast();
        } else {
            Node n = first;
            for (int i = 0; i < index; i++) {
                n = n.getNextNode();
            }
            Node L = n.getPreviousNode();
            L.setNextNode(n.getNextNode());
            if (n.getNextNode() != null) {
                n.getNextNode().setPreviousNode(L);
            }
            size--;
        }
        return true;
    }

// This Function to remove first Element with Time Complexity O(1)
    //  2 3 4
    public boolean removeFirst() {
        switch (size) {
            case 0:
                return false;
            case 1:
                size--;
                first = null;
                last = null;
                break;
            default:
                size--;
                first = first.getNextNode();
                break;
        }
        return true;
    }

//This Function to remove last Element with Time Complexity O(1)
    public boolean removeLast() {
        switch (size) {
            case 0:
                return false;
            case 1:
                size--;
                first = null;
                last = null;
                break;
            default:
                size--;
                Node n = last.getPreviousNode();
                n.setNextNode(null);
                last = n;
                break;
        }
        return true;
    }

    // This Function to get Each Element with Time Complexity O(n)
    public T get(int index) {
        if ((index + 1) > size) {
            return null;
        } else {
            Node n = first;
            for (int i = 1; i <= index; i++) {
                n = n.getNextNode();
            }
            return (T) n.getValue();
        }
    }

    // This Function to get last Element with Time Complexity O(1)
    public T getLast() {
        if (last == null) {
            return null;
        } else {
            return last.getValue();
        }
    }

    // This Function to get first Element with Time Complexity O(1)
    public T getfirst() {
        if (first == null) {
            return null;
        } else {
            return first.getValue();
        }
    }
    // This Function to check if List is empty or not

    public boolean isEmpty() {
        return size == 0;
    }
    // This Function to print all emlement

    public void printFromFirst() {
        Node n = first;
        while (n != null) {
            System.out.print(n.getValue()+" ");
            n = n.getNextNode();
        }
        System.out.println("");
    }
    
    public void printFromLast() {
        Node n = last;
        while (n != null) {
            System.out.print(n.getValue()+" ");
            n = n.getPreviousNode();
        }
        System.out.println("");
    }
// This Function to get size of List

    public int getSize() {
        return size;
    }

    // this Function to sort elements with Time Complexity (n^2)
    public void selectionSort() {
        Node n = first;
        while (n != null) {
            Node nn = n.getNextNode();
            while (nn != null) {
                if (n.compare(nn) == 1) {
                    T value = (T) n.getValue();
                    n.setValue(nn.getValue());
                    nn.setValue(value);
                }
                nn = nn.getNextNode();
            }
            n = n.getNextNode();
        }
    }

}
