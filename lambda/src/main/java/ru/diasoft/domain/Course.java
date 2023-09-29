package ru.diasoft.domain;

import com.sun.istack.internal.NotNull;

public class Course {
    String name;
    double score;

    public Course(@NotNull String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return "предмет " + name + " - оценка " + Math.round(score) + "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

}
