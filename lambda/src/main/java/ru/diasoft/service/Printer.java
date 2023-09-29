package ru.diasoft.service;

import ru.diasoft.domain.Person;

public interface Printer {
    static void printInfo(Person person) {
        System.out.printf("Person is %s %s\n", person.getFirstName(), person.getName());

    }
}
