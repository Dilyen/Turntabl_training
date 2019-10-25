package io.turntabl.university.model;

import io.turntabl.university.vars.CourseName;

public class Lecturer {
    private String name;
    private CourseName courseName;

    public Lecturer(String name, CourseName courseName) {
        this.name = name;
        this.courseName = courseName;
    }

    public String getName() {
        return name;
    }

    public CourseName getCourseName() {
        return courseName;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "name='" + name + '\'' +
                ", courseName=" + courseName +
                '}';
    }
}
