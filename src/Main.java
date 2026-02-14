import entity.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        IdGenerator idGen = IdGenerator.getInstance();

        Doctor doctor = new Doctor(
                idGen.generateId(),
                "Vimal Kumar pp",
                45,
                Specialization.GENERAL,
                2000
        );

        Patient patient = new Patient(
                idGen.generateId(),
                "Vikas p",
                29,
                "Fever"
                );

        Appointment appointment = new Appointment(
                idGen.generateId(),
                doctor,
                patient
                );

        appointment.Confirm();
        appointment.display();

        System.out.println(patient.getName());


        Bill bill = new Bill(doctor.getConsultationFee());
        System.out.println("Final Bill: " + bill.calculateBill());

    }
}