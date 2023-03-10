import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;


public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] getAllStudents() {
        return students;
    }

    public Student randomStudent() {
        int random = (int) (Math.random() * students.length);
        return students[random];
    }

    //////////////////////
    //////////////////////ruben
    public boolean findById1(String id) {
        List sList = Arrays.asList(students);
        return sList.contains(id);
    }

    ////kathi
    //shorter:
    public Student findById2(String id) {
        for (int i = 0; i < students.length; i++) {
            if (id.equals(students[i].getId())) {
                // alternativ
                // if (students[i].getId().equals(id)) {
                return students[i];
            }
        }
        throw new NoSuchElementException(); //weil dies eine unchecked exception ist, müssten wir sie oben nicht throwen
    }


    /////////////////////////
    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
}

