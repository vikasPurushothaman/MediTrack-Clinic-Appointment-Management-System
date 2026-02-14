package entity;

public class Patient extends Person implements Cloneable {
    private String disease;
    public  Patient (
            String id, String name, int age, String disease
    ) {
        super(id, name, age);
        this.disease = disease;
    }

        public Patient Clone() {
            return new Patient(this.id, this.name, this.age, this.disease);
        }


    public String getName(

    ) {
        return this.name;
    }

    public void display() {
        super.display();
        System.out.println("Disease: " + disease);
    }
}
