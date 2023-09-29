package ru.diasoft.service;

import ru.diasoft.domain.Person;

class PersonPrinter implements Printer {

    static void printInfo(Person person) {
        System.out.printf("Person is %s %s %s, возраст %s, тлф. %s\n", person.getName(), person.getFirstName(), person.getSecondName(), person.getAge(), person.getPhone());
    }
}
