package homework5;

public class Patient {
    public String lastName;
    public int treatmentPlan;
    private Doctor doctor;

    public Patient(String lastName, int treatmentPlan) {
        this.lastName = lastName;
        this.treatmentPlan = treatmentPlan;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String toString() {
        return lastName;
    }
}