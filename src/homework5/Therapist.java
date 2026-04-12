package homework5;

public class Therapist extends Doctor {

    @Override
    public void treat() {
        System.out.println("Провести общий осмотр состояния здоровья пациента");
    }

    public void assignDoctor(Patient patient) {
        if (patient.treatmentPlan == 1) {
            System.out.println("Назначен хирург");
            patient.setDoctor(new Surgeon());
        } else if (patient.treatmentPlan == 2) {
            System.out.println("Назначен дантист");
            patient.setDoctor(new Dentist());
        } else {
            System.out.println("Назначен терапевт");
            patient.setDoctor(new Therapist());
        }
        patient.getDoctor().treat();
    }
}