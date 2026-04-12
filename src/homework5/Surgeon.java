package homework5;

public class Surgeon extends Doctor {
    @Override
    public void treat() {
        System.out.println("Провести операцию пациенту");
    }
}