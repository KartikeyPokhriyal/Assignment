package GradeAssignment;

import GradeAssignment.Grade;

import java.util.Comparator;

public class SortByGrade implements Comparator<Grade> {

    @Override
    public int compare(Grade g1, Grade g2) {
        return g1.getGrade() - g2.getGrade();
    }
}
