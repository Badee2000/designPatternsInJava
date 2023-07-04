package iterator;

import java.util.ArrayList;

public class College {

    private ArrayList<Student> students;

    public College() {
        students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Iterator getYearIterator(int year) {
        return new YearIterator(this, year);
    }
}
