public class Main {

    public static void main(String[] args) {

        // =========================
        // PATIENT BST
        // =========================

        PatientBST bst = new PatientBST();

        Patient p1 = new Patient(101, "Kamal", 25, "0712345678", "Fever");

Patient p2 = new Patient(102, "Nimal", 35, "0723456789", "Headache");

Patient p3 = new Patient(103, "Sunil", 45, "0734567890", "Diabetes");
        bst.insert(p1);
        bst.insert(p2);
        bst.insert(p3);

        System.out.println("===== PATIENT SEARCH =====");

        Patient found = bst.search(101);

        if (found != null) {
            found.displayPatient();
        } else {
            System.out.println("Patient not found.");
        }


        // =========================
        // VISIT LINKED LIST
        // =========================

        VisitLinkedList visits = new VisitLinkedList();

        Visit v1 = new Visit(
                1,
                "2026-09-01",
                "Dr. Perera",
                "Fever",
                "Medicine"
        );

        Visit v2 = new Visit(
                2,
                "2026-09-03",
                "Dr. Silva",
                "Headache",
                "Painkillers"
        );

        visits.addVisit(v1);
        visits.addVisit(v2);

        System.out.println("\n===== VISIT HISTORY =====");
        visits.displayVisits();


        // =========================
        // TREATMENT STACK
        // =========================

        Stack treatmentStack = new Stack();

        Treatment t1 = new Treatment(
                1,
                "Blood Test",
                "Dr. Perera",
                2500
        );

        Treatment t2 = new Treatment(
                2,
                "X-Ray",
                "Dr. Silva",
                5000
        );

        treatmentStack.push(t1);
        treatmentStack.push(t2);

        System.out.println("\n===== TREATMENT STACK =====");
        treatmentStack.displayStack();

        System.out.println("\n===== POP TREATMENT =====");

Treatment completedTreatment = treatmentStack.pop();

if (completedTreatment != null) {
    completedTreatment.displayTreatment();
}

System.out.println("\n===== REMAINING TREATMENTS =====");
treatmentStack.displayStack();


        // =========================
        // EMERGENCY QUEUE
        // =========================

        EmergencyQueue queue = new EmergencyQueue();

        queue.enqueue(p1);
        queue.enqueue(p2);
        queue.enqueue(p3);

        System.out.println("\n===== EMERGENCY QUEUE =====");
        queue.displayQueue();

        System.out.println("\n===== DEQUEUE =====");

Patient dequeuedPatient = queue.dequeue();

if (dequeuedPatient != null) {

     dequeuedPatient.displayPatient();
}

System.out.println("\n===== REMAINING PATIENTS =====");
queue.displayQueue();

        // =========================
        // SEARCH VISIT
        // =========================

        System.out.println("\n===== SEARCH VISIT =====");

        Visit searchedVisit = visits.searchVisit(2);

        if (searchedVisit != null) {
            searchedVisit.displayVisit();
        } else {
            System.out.println("Visit not found.");
        }


        // =========================
        // REMOVE VISIT
        // =========================

        System.out.println("\n===== REMOVE VISIT =====");

        visits.removeVisit(1);

        System.out.println("\nVisits after removal:");
        visits.displayVisits();
        System.out.println("\n===== DELETE PATIENT =====");
bst.delete(102);

System.out.println("\n===== PATIENTS AFTER DELETE =====");
bst.inOrder();

System.out.println("\n===== DEQUEUE =====");

Patient nextPatient = queue.dequeue();

if (nextPatient != null) {
    nextPatient.displayPatient();
}

System.out.println("\n===== REMAINING PATIENTS =====");
queue.displayQueue();
    }
}