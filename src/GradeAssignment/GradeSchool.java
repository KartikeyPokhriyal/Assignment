package GradeAssignment;

import GradeAssignment.Grade;
import GradeAssignment.SortByGrade;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class GradeSchool {

    Grade gradee;
    ArrayList<Grade> school;

    public void createSchool() {

        Grade firstGrade = new Grade(4,new ArrayList());
        Grade secondGrade = new Grade(2, new ArrayList());
        firstGrade.createGrade();
        secondGrade.createGrade();
        firstGrade.addToGrade(4,"Christina");
        firstGrade.addToGrade(4,"Adele");
        firstGrade.addToGrade(4,"Whitney");
        firstGrade.addToGrade(4,"Beyonce");
        secondGrade.addToGrade(2,"Britney");
        secondGrade.addToGrade(2,"Taylor");
        secondGrade.addToGrade(2,"Demi");
        secondGrade.addToGrade(2,"Selena");
        secondGrade.addToGrade(2,"Rihana");
        System.out.println(firstGrade);
        System.out.println(secondGrade);

        ArrayList<Grade> school = new ArrayList<>();
        school.add(firstGrade);
        school.add(secondGrade);
        System.out.println(school);

        Collections.sort(school, new SortByGrade());
        System.out.println(school);

        firstGrade.getNames().sort(Comparator.naturalOrder());
        secondGrade.getNames().sort(Comparator.naturalOrder());

        System.out.println(school);
    }




}

