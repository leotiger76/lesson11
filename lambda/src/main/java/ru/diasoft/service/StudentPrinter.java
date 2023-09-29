package ru.diasoft.service;

import ru.diasoft.domain.Student;

class StudentPrinter implements Printer {

    static void printInfo(Student student) {
        System.out.printf("Student is %s %s %s, группа: %s, баллы: %s\n", student.getName(), student.getFirstName(), student.getSecondName(), student.getGroup(), student.getScore());
        System.out.println("\tСписок пройденных курсов: " + student.getCourses());
    }
}
