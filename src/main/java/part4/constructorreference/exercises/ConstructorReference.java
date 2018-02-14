package part4.constructorreference.exercises;

import part4.constructorreference.model.Student;
import part4.constructorreference.model.StudentFactory;

public class ConstructorReference {
    public static void main(String[] args) {

        // TODO 1. Create a new instance of the Factory class
        StudentFactory studentFactory = (name,age) -> new Student(name,age);

        // TODO 2. Create a new instance of Student class using the factory method
        Student student = studentFactory.getStudent("Elia", 32);
        System.out.println(student);
    }
}