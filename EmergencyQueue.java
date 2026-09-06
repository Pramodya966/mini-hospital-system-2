public class EmergencyQueue {

    class Node {
        Patient patient;
        Node next;

        Node(Patient patient) {
            this.patient = patient;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    public void enqueue(Patient patient) {

        Node newNode = new Node(patient);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    public Patient dequeue() {

        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return null;
        }

        Patient patient = front.patient;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return patient;
    }

    public Patient peek() {

        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return null;
        }

        return front.patient;
    }

    public void displayQueue() {

        if (front == null) {
            System.out.println("Emergency queue is empty.");
            return;
        }

        Node current = front;

        while (current != null) {
            current.patient.displayPatient();
            current = current.next;
        }
    }
}