package part4.constructorreference.model;

public class Student {
    String name;
    int age;

    // user defined constructor for reference
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}