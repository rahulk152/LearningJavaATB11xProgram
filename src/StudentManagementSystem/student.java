package StudentManagementSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class student {
    //Instance variable which are private and non-static and are stored in heap memory
    private String name;
    private int age;
    private String studentId;
    private List<String> courses;

    public student(String name, int age, String studentId) {
        super();
        if (validateAge(age) && validateName(name) && validateStudentId(studentId)){
            this.name = name;
            this.age = age;
            this.studentId = studentId;
            courses = new ArrayList<String>();
        }

    }



    public void enrollCourse(String course){
        if (validateCourseName(course)) {
            if (! courses.contains(course)) {
                courses.add(course);
                System.out.println("Student is Enrolled to " + course + " successfully!");

            }
            else {
                System.err.println("Student is already enrolled for the course "+course);
            }
        }

    }

    public void printStudentInfo(){
        System.out.println("========== Student Information ==========");
        System.out.println("Student Name: "+name);
        System.out.println("Student age: "+age);
        System.out.println("Student Id: "+studentId);
        System.out.println("Enrolled For: "+courses);
    }

    @Override
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", courses=" + courses +
                '}';
    }

    //Validation Methods
    public boolean validateAge(int age){
        if (age >= 19 && age <= 35) {
            return true;
        }
        else {
            System.err.println("Invalid Age!!! Student Age needs to be between 19 and 35");
            return false;
        }
    }

    public boolean validateName(String name){

        String nameRegex = "^[a-zA-Z\\s]+$";
        Pattern namePattern = Pattern.compile(nameRegex);
        Matcher nameMatcher = namePattern.matcher(name);
        if (nameMatcher.matches()){
            return true;
        }
        else {
            System.err.println("Invalid Name!!! Please enter alphabet only");
            return false;
        }
    }
    private boolean validateStudentId(String studentId) {
       String studentIdRegex = "S-\\d+$";
       Pattern studentIdPattern = Pattern.compile(studentIdRegex);
       Matcher studentMatcher = studentIdPattern.matcher(studentId);
        if (studentMatcher.matches()) {
            return true;
        }else {
            System.err.println("Invalid Student ID!! Please enter correct Id eg..S-247");
            return false;
        }

    }
    public boolean validateCourseName(String course){
        if(course.equalsIgnoreCase("Java") || course.equalsIgnoreCase("DSA") || course.equalsIgnoreCase("Devops")) {
           return true;
        } else{
            System.err.println("Invalid Course Name!! Please Select course from the list!! [Java, DSA, Devops]");
            return false;
        }

    }
}
