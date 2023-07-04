package iterator;

import java.util.ArrayList;

public class YearIterator implements Iterator {

    private College c;
    private int year;
    private int current;

    public YearIterator(College c, int year) {
        this.c = c;
        this.year = year;
        current = 0;
    }

    public boolean hasNext() {
        ArrayList<Student> s = c.getStudents();
        for (int i = current; i < s.size(); i++) {
            if (s.get(i).getYear() == year) {
                current = i;
                return true;
            }
        }
        return false;
    }

    public Student next() {
        Student s = c.getStudents().get(current);
        current++;
        return s;
    }

}
