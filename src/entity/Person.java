package entity;

public class Person extends MedicalEntity {
    protected String name;
    protected int age;

    public Person (String id, String name, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    @Override
    public void display() {
        System.out.println("ID: " + id + " Name: " + name + " Age: " + age);
    }
}
