package StudentManagementSystem;

public class main {
    public static void main(String[] args) {
        System.out.println("********** Student Management System **********");
        System.out.println("********** Welcome **********");
        student s1 = new student("Ram kumar",22,"S-11");
        s1.enrollCourse("Java");
        s1.enrollCourse("DSA");
        s1.enrollCourse("Devops");
        s1.enrollCourse("C#");
        //s1.printStudentInfo();
        System.out.println(s1);
        student s2 = new student("Sita",20,"S-12");
        s2.enrollCourse("DSA");
        System.out.println(s2);
        student s3 = new student("Raja",23,"S-13");
        s3.enrollCourse("Devops");
        System.out.println(s3);
    }
}
