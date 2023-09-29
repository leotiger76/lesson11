package ru.diasoft.domain;

import java.util.Comparator;
import java.util.TreeSet;

public class Student extends Person {
    // В класс Student добавить поле курсы, которое содержит: название пройденного курса и оценку за него.
    // Храниться список курсов должен в отсортированном виде. Сортировка в обратном алфавитному порядке.
    TreeSet<Course> courses = new TreeSet((Comparator<Course>) (a, b) -> a.getName().compareTo(b.getName()) < 0 ? 1 : -1);
    private String group;
    private double score;

    public Student(Person person, String group, double score) {
        this(person.getName(), person.getFirstName(), person.getSecondName(), person.getAge(), person.getPhone(), group, score);
    }

    public Student(String name, String firstName, String secondName, int age, String phone, String group, double score) {
        super(name, firstName, secondName, age, phone);
        this.group = group;
        this.score = score;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }
    public TreeSet<Course> getCourses() {
        return courses;
    }
}
