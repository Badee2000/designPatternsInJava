import iterator.College;
import iterator.Student;

public class Iterator {
    public static void main(String[] args) {

        College c = new College();

        c.addStudent(new Student("John", 2020));
        c.addStudent(new Student("Emily", 2021));
        c.addStudent(new Student("Michael", 2019));
        c.addStudent(new Student("Olivia", 2022));
        c.addStudent(new Student("Jacob", 2023));
        c.addStudent(new Student("Sophia", 2020));
        c.addStudent(new Student("William", 2022));
        c.addStudent(new Student("Ava", 2021));
        c.addStudent(new Student("Ethan", 2023));
        c.addStudent(new Student("Isabella", 2019));

        // for (Student s : c.getStudents()) {
        // System.out.println(s.getName() + " " + s.getYear());
        // }
        Iterator it = (Iterator) c.getYearIterator(5);
        while (((iterator.Iterator) it).hasNext()) {
            System.out.println(((iterator.Iterator) it).next().getName());
        }
    }
}
