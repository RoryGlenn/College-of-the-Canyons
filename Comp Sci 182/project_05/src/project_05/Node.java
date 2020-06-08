package project_05;

/**
 * @author RoryGlenn
 */
public class Node {

    String name;
    long phoneNumber;

    Node leftChild;
    Node rightChild;

    public Node(String name, long phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public Node(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    @Override
    public String toString() {
        return name + " has a key " + phoneNumber;
    }

}
