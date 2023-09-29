package ru.diasoft.service;

import ru.diasoft.domain.Course;
import ru.diasoft.domain.Person;
import ru.diasoft.domain.Student;

import java.util.HashMap;

public class PersonDemo {
    public PersonDemo() {
        Person person1 = new Person("Максимов", "Лев", "Викторович", 46, "8(916)111-22-33");
        //PersonPrinter.printInfo(person1);
        Student student1 = new Student(person1, "28-A", 900);

        student1.addCourse(new Course("java", 4));
        student1.addCourse(new Course("assembler", 3));
        student1.addCourse(new Course("lambda", 5));
        StudentPrinter.printInfo(student1);

        Person person2 = new Person("Иванов", "Иван", "Викторович", 26, "911");
        Student student2 = new Student(person2, "2Б", 500);
        student2.addCourse(new Course("fortran", 4));
        student2.addCourse(new Course("lambda", 3));
        student2.addCourse(new Course("basic", 5));
        student2.addCourse(new Course("python", 10));

        StudentPrinter.printInfo(student2);

    }
}
