package io.turntabl.university.model;

import io.turntabl.university.vars.Year;

public class Student {
    private String name;
    private int id;
    private Year year;

    public Student(String name, int id, Year year) {
        this.name = name;
        this.id = id;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Year getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", year=" + year +
                '}';
    }
}
