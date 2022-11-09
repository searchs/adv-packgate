package com.katchfashion.nyltics.enumbox;

import static java.lang.System.out;

public class Grades {

    enum GradeLevel {A,B,C,D,E}

    public static void main(String[] args) {
        GradeLevel mike, ade, shade;

        mike = GradeLevel.B;
        ade = GradeLevel.A;
        shade = GradeLevel.E;

        out.println("Student Examinations: Grade - " + ade.name() +
                " with Ordinal value:  " + ade.ordinal());
        out.println("Student Examinations: Grade - " + mike.name() +
                " with Ordinal value:  " + mike.ordinal());
        out.println("Student Examinations: Grade - " + shade.name() +
                " with Ordinal value:  " + shade.ordinal());
    }

}
