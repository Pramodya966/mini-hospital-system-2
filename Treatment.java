public class Treatment {

    int treatmentId;
    String treatmentName;
    String doctorName;
    double cost;

    public Treatment(int treatmentId, String treatmentName,
                     String doctorName, double cost) {

        this.treatmentId = treatmentId;
        this.treatmentName = treatmentName;
        this.doctorName = doctorName;
        this.cost = cost;
    }

    public void displayTreatment() {
        System.out.println("Treatment ID: " + treatmentId);
        System.out.println("Treatment: " + treatmentName);
        System.out.println("Doctor: " + doctorName);
        System.out.println("Cost: " + cost);
        System.out.println("-------------------------");
    }
}