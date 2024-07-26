package aulas.a6_classes;

public class Pessoa {
    public String fullName;
    public short age;
    public float height;

    public Pessoa(String fullName, int age, float height) {
        this.fullName = fullName;
        this.age = (short) age;
        this.height = height;
    }
}
