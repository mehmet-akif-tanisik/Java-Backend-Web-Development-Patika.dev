package homeworks.studentgradesystem;

public class Test {

    public static void main(String[] args) {

        Teacher t1 = new Teacher("John Cena", "HST", "11234");
        Teacher t2 = new Teacher("Will Smith", "PHY","445566");
        Teacher t3 = new Teacher("Greg Toms","BIO","5678");

        Course history = new Course("History","101","HST");
        history.addTeacher(t1);

        Course physics = new Course("Physics","102","PHY");
        physics.addTeacher(t2);

        Course biology = new Course("Biology","201","BIO");
        biology.addTeacher(t3);


        Student s1 = new Student("Dwayne Hardwee", "123","4",history,physics,biology);
        s1.addBulkExamGrades(100,70,50);
        s1.addBulkVerbalGrades(30,50,70);
        s1.isPass();
        System.out.println("-----------------------");
        Student s2 = new Student("Camaron Diaz", "112","4",history,physics,biology);
        s2.addBulkExamGrades(50,40,50);
        s2.addBulkVerbalGrades(30,50,70);
        s2.isPass();

    }
}
