/*
 *  Author: Rory Glenn
 */

 /*
A Node class. Your queue ADT will need this class in order to instantiate 
the Node objects which make up the linear linked list.
 */
package project_04;

public class Node<P> {

    private P item;                     
    private Node nextNode;
    private Node previousNode;

    public Node(P newItem) {
        this.item = newItem;
        nextNode = null;
    }

    public P getItem() {
        return item;
    }

    public void setPreviousNode(Node<P> prevNode) {
        this.previousNode = prevNode;
    }

    public void setNextNode(Node<P> nextNode) {
        this.nextNode = nextNode;
    }

    public Node<P> getNextNode() {
        return nextNode;
    }

    public Node<P> getPreviousNode() {
        return previousNode;
    }

    public String toString() {
        return this.item.toString();

    }
}
