package homeworks.StudentGradeSystem;

public class Course {
    Teacher teacher;
    String name;
    String code;
    String prefix;
    int grade;
    int verbalGrade;

    public Course(String theName, String theCode, String thePrefix){
        name = theName;
        code = theCode;
        prefix = thePrefix;
        grade = 0;
        verbalGrade = 0;
    }

    public void addTeacher(Teacher teacher){
        if (teacher.branch.equals(prefix)){
            this.teacher = teacher;
        } else {
            System.out.println("Teacher and prefix do not match!");
        }
    }





}
