package io.turntabl.university;

import io.turntabl.university.model.Course;
import io.turntabl.university.model.Lecturer;
import io.turntabl.university.model.Student;
import io.turntabl.university.vars.CourseName;
import io.turntabl.university.vars.CourseYear;
import io.turntabl.university.vars.Year;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //Creating lecturers
        Lecturer alice = new Lecturer("Dr. Alice Arthur", CourseName.INTO_TO_PROGRAMMING);
        Lecturer emma = new Lecturer("Prof. Emmanuel Tandoh", CourseName.ADVANCE_GARDENING);
        Lecturer eric = new Lecturer("Dr. Eric Sane", CourseName.PHYSICS);

        List<Student> students= Arrays.asList(
            new Student("Shadrack Ankomehene", 101, Year.ONE),
            new Student("John Nkum", 111, Year.TWO),
            new Student("Celina Williams", 132, Year.THREE),
            new Student("Sam Moorhouse", 110, Year.FOUR),
            new Student("Franklin Luther", 120, Year.FOUR),
            new Student("Alex Owusu", 200, Year.THREE),
            new Student("Cleopatra Owusu", 300, Year.FOUR),
            new Student("Esther Arthur", 89, Year.TWO),
            new Student("Francis Billa", 77, Year.ONE),
            new Student("Doreen Essumang", 55, Year.ONE),
            new Student("Akuffo Addo", 105, Year.TWO),
            new Student("Eva Korankye", 67, Year.THREE),
            new Student("Mercy Arkoh", 19, Year.FOUR),
            new Student("Justina Arhin", 10, Year.THREE),
            new Student("Sarah Asieduah", 26, Year.FOUR)
        );

        List<Student> firstYearStudents = new ArrayList<>();

        for (Student student : students){
            if (student.getYear() == Year.ONE){
                firstYearStudents.add(student);
            }
        }

        //Programming course
        Course programming = new Course(alice, firstYearStudents, CourseYear.FIRST);

        System.out.println(programming);

        List<Student> thirdAndForthYearStudents = new ArrayList<>();
        for (Student student : students){
            if (student.getYear() == Year.THREE || student.getYear() == Year.FOUR){
                thirdAndForthYearStudents.add(student);
            }
        }

        //Programming course
        Course gardening = new Course(emma, thirdAndForthYearStudents, CourseYear.THIRD_FOURTH);
        System.out.println(gardening);

        List<Student> vowelStudent = students
                        .stream()
                        .filter(s -> s.getName().toLowerCase().startsWith("a") || s.getName().toLowerCase().startsWith("e") ||
                                    s.getName().toLowerCase().startsWith("i") || s.getName().toLowerCase().startsWith("o") ||
                                    s.getName().toLowerCase().startsWith("u")
                        )
                        .collect(Collectors.toList());

        vowelStudent.forEach(s -> System.out.println(s.getName()));


        //Programming course
        Course physics = new Course(eric, vowelStudent, CourseYear.FOURTH);
        System.out.println("Vowel Students: "+ physics);

    }
}
