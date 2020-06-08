package project_05;

import java.io.IOException;
import java.util.NoSuchElementException;

public class PhoneBook {

    Node root;
    Node parentNode;

    // Constructor
    public PhoneBook() {
        root = null;
        parentNode = null;
    }

    // When this constructor is invoked, it will read all the information from the text file and put it into the tree
    public PhoneBook(String textFile) {
        // use the Scanner and a File object
    }

    //Adds a person’s name and phone number to the phone book.
    public void addNode(String name, long phoneNumber) {

        try {

            Node newNode = new Node(name, phoneNumber);

            if (root == null) {
                root = newNode;
            }
            else {
                Node focusNode = root;
                while (true) {
                    parentNode = focusNode;
                    if (name.compareToIgnoreCase(focusNode.name) < 0) {
                        focusNode = focusNode.leftChild;
                        if (focusNode == null) {
                            parentNode.leftChild = newNode;
                            return;
                        }
                    }
                    else {
                        focusNode = focusNode.rightChild;
                        if (focusNode == null) {
                            parentNode.rightChild = newNode;
                            return;
                        }
                    }
                }
            }
        }

        catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    //Deletes a given person’s name and phone number from the phone book, given only the name.
    public void deleteNode(String name) {

        try {
            // Algorithm note: There are four cases to consider:
            // 1. The node is a leaf
            // 2. The node has no left child
            // 3. The node has no right child
            // 4. The node has two children
            // focusNode will hold the reference of the node who matches the String 'name' that was passed in
            Node focusNode = findNode(name);
            // Check to see if the node who holds the value of 'name', has any children

            // Deletes the root node
            if (focusNode.name == root.name) {
                root = null;
                return;
            }

            // Case 1: Node has no children
            if (focusNode.leftChild == null && focusNode.rightChild == null) {
                // if the node has no children, delete the reference to it
                // but in order to do that, you have to check the children of the previousNode
                // and if the current node that you want to delete is either the left or the right node of that parentNode
                // If it is the left node, delete it. If it is the right node, delete it

                // Checks which child should be deleted based on the 'name' that was passed in
                if (parentNode.leftChild.name == name) {
                    // If 'name' matches the child, delete the parents reference to that node
                    parentNode.leftChild = null;
                    return;
                }
                else if (parentNode.rightChild.name == name) {
                    // If 'name' matches the child, delete the parents reference to that node
                    parentNode.rightChild = null;
                    return;
                }
                else {
                    System.out.println("Nothing was found");
                }
            }

            // Case 2: Node has one child
            // Will only run if focusNode has one child and ONLY one child
            // This is because of the "exclusive or" operator ^
            if (focusNode.leftChild != null ^ focusNode.rightChild != null) {
                // Does focusNode have a left child?
                if (focusNode.leftChild != null) {
                    // focusNode only has a left child
                    // Does the name passed in match the node in the tree?
                    if (parentNode.rightChild != null && parentNode.rightChild.name == name) {
                        parentNode.rightChild = focusNode.leftChild;
                        return;
                    }
                    else {
                        parentNode.leftChild = focusNode.leftChild;
                        return;
                    }
                }
                else {
                    if (parentNode.leftChild != null && parentNode.leftChild.name == name) {
                        parentNode.leftChild = focusNode.rightChild;
                        return;
                    }
                    else {
                        parentNode.rightChild = focusNode.rightChild;
                        return;
                    }

                }

            }

            // Case 3: Node has two children
            // Copy the node who has the lesser value into the position of the parent
            if (focusNode.leftChild != null && focusNode.rightChild != null) {
                // If we should search to the left
                if (focusNode.leftChild.name.compareToIgnoreCase(focusNode.rightChild.name) < 0) {
                    // Not sure if I need to check again...
                    if (focusNode.leftChild.name == name) {
                        // Copy info from child node into parent node, then delete the node
                        parentNode.name = focusNode.leftChild.name;
                        parentNode.phoneNumber = focusNode.leftChild.phoneNumber;
                        parentNode.leftChild = null;
                        return;
                    }
                }

////             I don't think we will ever want to take the value on the right side
////             and put it in the parents position because this will make the tree unbalanced
////             But just in case I am wrong, here is the code
////             If we should search to the right
//            else if ((focusNode.leftChild.name.compareToIgnoreCase(focusNode.rightChild.name) > 0)) {
//                if (focusNode.rightChild.name == name) {
//                    // Copy info from child node into parent node, then delete the node
//                    parentNode.name = focusNode.rightChild.name;
//                    parentNode.phoneNumber = focusNode.rightChild.phoneNumber;
//                    parentNode.rightChild = null;
//                }
//            }
                else {
                    System.out.println("Nothing was found");
                }

            }
        }
        catch (NullPointerException e) {
            System.out.println(e + "\nNothing was found");
        }
    }

    //Locates a person’s phone number, given only the person’s name.
    public Node findNode(String name) {

        try {

            // Start at the top of the tree
            parentNode = null;
            Node focusNode = root;

            // While we haven't found the Node
            // keep looking
            while (!name.equalsIgnoreCase(focusNode.name)) {
                // If we should search to the left
                if (name.compareToIgnoreCase(focusNode.name) < 0) {
                    // Shift the focus Node to the left child

                    //previousNode = focusNode;
                    parentNode = focusNode;
                    focusNode = focusNode.leftChild;
                }
                else {
                    // Shift the focus Node to the right child
                    //previousNode = focusNode;
                    parentNode = focusNode;
                    focusNode = focusNode.rightChild;
                }
                // The node wasn't found
                if (focusNode == null) {
                    System.out.println("Nothing was found");
                }
            }
            return focusNode;

        }

        catch (NoSuchElementException | NullPointerException e) {
            System.out.println(e);
        }

        return null;
    }

    //Changes a person’s phone number, given the person’s name and new phone number.
    public Node changeNode(String name, long phoneNumber) {

        try {
            
            Node newNode = new Node(name, phoneNumber);
            Node focusNode = findNode(name);
            focusNode.phoneNumber = newNode.phoneNumber;

            return focusNode;
        }
        catch (NullPointerException e) {
            System.out.println(e);
        }
        return null;
    }

    // Printing the contents of the tree in an inorder way.
    public void printInorder() {
        printInOrderRec(root);
        System.out.println("");
    }

    // Helper method to recursively print the contents in an inorder way
    private void printInOrderRec(Node currRoot) {
        if (currRoot == null) {
            return;
        }

        printInOrderRec(currRoot.leftChild);
        System.out.print(currRoot.name + ", " + currRoot.phoneNumber);
        printInOrderRec(currRoot.rightChild);
    }

    // Quits the application, after first saving the phone book in a text file.
    public void quit() throws IOException {
        // Save all of the information from the tree and save it to a text file
        // Make sure to use the PrintWriter class to write information to the text file

        //FileIO fileio = new FileIO(this);
        
        
        
        printInorder();
        
    }
}
