public class Stack {

    class Node {
        Treatment treatment;
        Node next;

        Node(Treatment treatment) {
            this.treatment = treatment;
            this.next = null;
        }
    }

    Node top;

    public void push(Treatment treatment) {
        Node newNode = new Node(treatment);

        newNode.next = top;
        top = newNode;

        System.out.println("Treatment added to stack.");
    }

    public Treatment pop() {

        if (top == null) {
            System.out.println("Stack is empty.");
            return null;
        }

        Treatment treatment = top.treatment;
        top = top.next;

        return treatment;
    }

    public Treatment peek() {

        if (top == null) {
            System.out.println("Stack is empty.");
            return null;
        }

        return top.treatment;
    }

    public void displayStack() {

        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;

        while (current != null) {
            current.treatment.displayTreatment();
            current = current.next;
        }
    }
}