/*
 * Author: Rory Glenn
 * Class: Computer Science 182
 * Teacher: Benjamin Riveira
 */
package project_04;

import java.util.NoSuchElementException;

/*
A Queue ADT. This is a class which contains global, private head and tail 
reference variables as well as the Queue’s “wall of operations”. 
This “wall of operations” are the methods which are responsible for 
creating and managing the ADT’s Linked List which. Queue ADT will use
this Linked List to represent the queue.
 */
public class Queue<P> {

    //private LinkedList data;                  // number of elements on queue
    private Node head;                          // beginning of queue
    private Node tail = null;                   // end of queue
    private int size;                           // number of elements on queue

    //Initializes empty queue
    public Queue() {
        head = null;
        tail = null;
        size = 0;
    }

    public void enqueue(P item) throws NoSuchElementException {
        // Adds newItem at the back of a queue. 
        // Throws QueueException if the operation is not successful
        // check to see if the current linkedlist is empty
        // if it is, set head = newNode
        // if not, add to the back of the linkedlist
        Node<P> oldTail = this.tail;
        Node<P> newTailNode = new Node<>(item);

        if (oldTail != null) {
            oldTail.setNextNode(newTailNode);
            newTailNode.setNextNode(null);
            this.tail = newTailNode;
        }
        else {
            this.tail = newTailNode;
            this.head = newTailNode;
        }
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            throw new NoSuchElementException("Queue underflow");
        }

        this.head = this.head.getNextNode();
        size--;

        return this.head.getItem();

    }

    public boolean isEmpty() {
        return this.head == null;
    }

    public int length() {
        return size;
    }

    public void dequeueAll() throws RuntimeException {

        if (isEmpty()) {
            System.out.println("Queue is already empty");
        }

        else {
            head = null;
            tail = null;
        }

    }

    public Object peek() {
        return this.head.getItem();
    }

}
