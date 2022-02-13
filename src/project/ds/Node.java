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
public class Node <T> {
    private T Value;
    private Node<T> nextNode;
    private Node<T> previousNode;

    public Node(T Value) {
        this.Value = Value;
    }

    public T getValue() {
        return Value;
    }

    public void setValue(T Value) {
        this.Value = Value;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<T> previousNode) {
        this.previousNode = previousNode;
    }
    // this Function to return value to compare it
   @Override
   public String toString(){
       return getValue()+"";
   }
   public int compare(Node n){
       int c = 0;
       if(this.toString().compareTo(n.toString())<0){
           c = -1;
       }else if(this.toString().compareTo(n.toString())>0){
           c = 1;
       }
       return c;
   }
}
