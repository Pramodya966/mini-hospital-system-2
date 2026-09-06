public class PatientBST {

    class Node {
        Patient patient;
        Node left;
        Node right;

        Node(Patient patient) {
            this.patient = patient;
            left = null;
            right = null;
        }
    }

    Node root;

    // Insert patient
    public void insert(Patient patient) {
        root = insertRec(root, patient);
    }

    private Node insertRec(Node root, Patient patient) {

        if (root == null) {
            return new Node(patient);
        }

        if (patient.patientId < root.patient.patientId) {
            root.left = insertRec(root.left, patient);
        }
        else if (patient.patientId > root.patient.patientId) {
            root.right = insertRec(root.right, patient);
        }

        return root;
    }

    // Search patient
    public Patient search(int patientId) {

        Node result = searchRec(root, patientId);

        if (result != null) {
            return result.patient;
        }

        return null;
    }

    private Node searchRec(Node root, int patientId) {

        if (root == null || root.patient.patientId == patientId) {
            return root;
        }

        if (patientId < root.patient.patientId) {
            return searchRec(root.left, patientId);
        }

        return searchRec(root.right, patientId);
    }

    // In-order traversal
    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(Node root) {

        if (root != null) {
            inOrderRec(root.left);
            root.patient.displayPatient();
            inOrderRec(root.right);
        }
    }

    // Delete patient
    public void delete(int patientId) {
        root = deleteRec(root, patientId);
    }

    private Node deleteRec(Node root, int patientId) {

        if (root == null) {
            return null;
        }

        if (patientId < root.patient.patientId) {
            root.left = deleteRec(root.left, patientId);
        }
        else if (patientId > root.patient.patientId) {
            root.right = deleteRec(root.right, patientId);
        }
        else {

            // No left child
            if (root.left == null) {
                return root.right;
            }

            // No right child
            if (root.right == null) {
                return root.left;
            }

            // Two children
            Node successor = root.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            root.patient = successor.patient;

            root.right = deleteRec(
                root.right,
                successor.patient.patientId
            );
        }

        return root;
    }
}