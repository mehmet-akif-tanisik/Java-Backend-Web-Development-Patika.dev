package homeworks.studentgradesystem;

public class Student {

    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentId;
    String classes;
    double average;
    boolean isPass;


    public Student(String theName, String theStudentId, String theClasses, Course theCourse1, Course theCourse2, Course theCourse3){
        name = theName;
        studentId = theStudentId;
        classes = theClasses;
        course1 = theCourse1;
        course2 = theCourse2;
        course3 = theCourse3;
        average = 0;
        isPass = false;
    }

    public void addBulkExamGrades(int grade1, int grade2, int grade3){
        if (grade1>=0 && grade1<=100 ){
            course1.grade = grade1;
        }
        if (grade2>=0 && grade2<=100){
            course2.grade = grade2;
        }
        if (grade3>=0 && grade3<=100){
            course3.grade = grade3;
        }
    }

    public void addBulkVerbalGrades(int verbal1, int verbal2, int verbal3){
        if (verbal1>=0 && verbal1<=100 ){
            course1.verbalGrade = verbal1;
        }
        if (verbal2>=0 && verbal2<=100 ){
            course2.verbalGrade = verbal2;
        }
        if (verbal3>=0 && verbal3<=100 ){
            course3.verbalGrade = verbal3;
        }
    }

    public void isPass(){
        average =(((course1.grade + course2.grade + course3.grade)*0.80) +
                ((course1.verbalGrade + course2.verbalGrade + course3.verbalGrade)*0.20)) / 3.0;
        if (average>55){
            System.out.println("You have passed this year successfully");
        } else {
            System.out.println("You have not passed this year.");
        }
        printGrades();
    }



    public void printGrades(){
        System.out.println(course1.name + " Grade  \t:" + course1.grade);
        System.out.println(course1.name + " V.Grade\t:" + course1.verbalGrade);
        System.out.println(course2.name + " Grade  \t:" + course2.grade);
        System.out.println(course2.name + " V.Grade\t:" + course2.verbalGrade);
        System.out.println(course3.name + " Grade  \t:" + course3.grade);
        System.out.println(course3.name + " V.Grade\t:" + course3.verbalGrade);
        System.out.println("Average: " + average);
    }



}
