package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAverage()>o2.getAverage() ? 1 : (o1.getAverage()<o2.getAverage()) ? -1 : 0;
    }
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student(1, 3.5, "Putur"));
        students.add(new Student(2, 5, "Zur"));
        ArrayList<Student> students2 = new ArrayList<Student>();
        students.add(new Student(3, 4, "Sho"));
        students.add(new Student(4, 4, "Avr"));
        students.addAll(students2);
        Collections.sort(students, new SortingStudentByGPA());
        for (Student s : students) {
            System.out.print(s.getAverage()+" ");
        }
    }
}
