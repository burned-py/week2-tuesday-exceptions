public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("123", "Florian");
        Student student2 = new Student("456", "Matthias");
        Student student3 = new Student("789", "Daniel");

        Student[] allStudents = new Student[2];

        allStudents[0] = student1;
        allStudents[1] = student2;

        StudentDB studentDB = new StudentDB(allStudents);
/*
        System.out.println(studentDB);
        System.out.println(studentDB.getAllStudents());
        System.out.println(studentDB.randomStudent());*/
        //////////////
        //System.out.println(studentDB.findById1("123"));
        System.out.println(studentDB.findById2("456"));


    }
}
