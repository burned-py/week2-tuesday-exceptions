import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("123", "Florian");
        Student student2 = new Student("456", "Matthias");
        Student student3 = new Student("789", "Daniel");



        //////<COLLECTIONS>
        //////List
/*        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student ("777", "Petra"));
        students.add(new Student ("111", "Peter"));*/

        //Map
        Map<Integer, Student> studentsMap = new HashMap<>();

        studentsMap.put(1, new Student ("777", "Petra"));
        studentsMap.put(2, new Student ("111", "Peter"));

        //studentsMap.remove(1);
        System.out.println(studentsMap.get(1));
        System.out.println(studentsMap.size());


        for (Student stud : studentsMap.values()) {
            System.out.println(stud);
        }

        for (Map.Entry<Integer, Student> entry : studentsMap.entrySet()) {
            System.out.println(("Key " + entry.getKey() + " Value " + entry.getValue()));
        }
        //key muss eindeutig sein?

        //ArrayList Einträge können nur über index angesprochen werden


        //
        //
        //

        //dieser code ist mies dann kommentiere ich ihn doch besser weg



         bin ich jetzt im testbranch?!


                nö, aber ich weiß jetzt, dass ich im master branch schreib.
                --> und i ch nenne auch die commit message so
        //
        //






        /////</COLLECTIONS>




/*        Student[] allStudents = new Student[2];

        allStudents[0] = student1;
        allStudents[1] = student2;

        StudentDB studentDB = new StudentDB(allStudents);*/
/*
        System.out.println(studentDB);
        System.out.println(studentDB.getAllStudents());
        System.out.println(studentDB.randomStudent());*/
        //////////////
        //System.out.println(studentDB.findById1("123"));

        //System.out.println(studentDB.findById2("999"));
/*
        System.out.println("rausgesucht");
        try {
            System.out.println(studentDB.findById2("111"));

        } catch (NoSuchElementException e) {
            System.out.println("nicht gefunden");
        }*/
    }
}
