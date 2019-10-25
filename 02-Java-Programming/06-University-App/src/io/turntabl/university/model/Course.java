package io.turntabl.university.model;

import io.turntabl.university.vars.CourseName;
import io.turntabl.university.vars.CourseYear;

import java.util.List;

public class Course {
    private Lecturer lecturerName;
    private List<Student> students;
    private CourseYear courseYear;

    public Course(Lecturer lecturerName, List<Student> students, CourseYear courseYear) {
        this.lecturerName = lecturerName;
        this.students = students;
        this.courseYear = courseYear;
    }

    public Lecturer getLecturerName() {
        return lecturerName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public CourseYear getCourseYear() {
        return courseYear;
    }

    @Override
    public String toString() {
        return "Course{" +
                "lecturerName=" + lecturerName +
                ", students=" + students +
                ", courseYear=" + courseYear +
                '}';
    }
}
