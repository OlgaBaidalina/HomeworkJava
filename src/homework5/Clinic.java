package homework5;


/*
Создать программу для имитации работы клиники. Пусть в клинике будет три
врача: хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но
каждый врач лечит по-своему. Так же предусмотреть класс «Пациент» с полем
«План лечения» и полем «Доктор». Создать объект класса «Пациент» и
добавить пациенту план лечения. У терапевта создать метод, который будет
назначать врача пациенту согласно плану лечения:
Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
Если план лечения имеет код 2 – назначить дантиста и выполнить метод
лечить.
Если план лечения имеет любой другой код – назначить терапевта и
выполнить метод
лечить.
*/

public class Clinic {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Кораблёв В.К.", 1);
        Patient patient2 = new Patient("Шевченко Ю.Н.", 2);
        Patient patient3 = new Patient("Романовская Т.А.", 4);

        Therapist therapist = new Therapist();

        System.out.println("Пациент: " + patient1);
        System.out.println("План лечения: " + patient1.treatmentPlan);
        therapist.assignDoctor(patient1);

        System.out.println("\nПациент: " + patient2);
        System.out.println("План лечения: " + patient2.treatmentPlan);
        therapist.assignDoctor(patient2);

        System.out.println("\nПациент: " + patient3);
        System.out.println("План лечения: " + patient3.treatmentPlan);
        therapist.assignDoctor(patient3);
    }
}