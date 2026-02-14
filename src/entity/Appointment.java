package entity;

public class Appointment extends  MedicalEntity{
    private Doctor doctor;
    private  Patient patient;
    private  AppointmentStatus status;
   public Appointment(
           String id, Doctor doctor , Patient patient
   ) {
       this.id = id;
       this.doctor = doctor;
       this.patient = patient;
       this.status =AppointmentStatus.PENDING;
   }
   public void Confirm() {
       status = AppointmentStatus.CONFIRMED;
   }
   public void cancel() {
       status = AppointmentStatus.CANCELLED;
   }


    public void display() {
        System.out.println("Appointment ID: " + id +
                " Status: " + status  );
    }


}
