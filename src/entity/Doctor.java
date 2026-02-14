package entity;

public class Doctor extends Person {
    private  Specialization specialization;
    private double consultationFee;

    public  Doctor(
            String id, String name, int age, Specialization specialization, double fee
    ){
        super(id, name, age);
        this.specialization = specialization;
        this.consultationFee = fee;
    }
    public  double getConsultationFee() {
        return consultationFee;
    }
    public  Specialization getSpecialization() {
        return specialization;
    }
    public void display() {
        super.display();
        System.out.println("Specialization: " + specialization +
                " Fee: " + consultationFee);
    }

}
