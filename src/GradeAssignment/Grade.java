package GradeAssignment;

import java.util.ArrayList;
import java.util.HashMap;

public class Grade {
    int grade;
    ArrayList<String> names;
    HashMap<Integer,ArrayList<String>> gradeStudents;

    public Grade(int grade, ArrayList names) {
        this.grade = grade;
        this.names = names;
    }

    public void createGrade() {
        gradeStudents = new HashMap<>();
        gradeStudents.put(grade,names);
    }

    public void addToGrade(int grade, String name) {
        names.add(name);
        gradeStudents.put(grade, names);
    }

    public int getGrade() {
        return grade;
    }

    public HashMap<Integer, ArrayList<String>> getGradeStudents() {
        return gradeStudents;
    }

    public ArrayList<String> getNames() {
        return names;
    }

    @Override
    public String toString() {
        return "GradeSchool{" +
                "grade=" + grade +
                ", gradeStudents=" + gradeStudents +
                '}';
    }

}
