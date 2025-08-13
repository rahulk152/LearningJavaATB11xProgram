package StudentManagementSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class main2 {
    private static List<student> studentList;
    public static void main(String[] args) {
        System.out.println("********** Student Management System **********");
        System.out.println("********** Welcome **********");
        studentList = new ArrayList<student>();
        student s1 = new student("Ram",22,"S-11");
        s1.enrollCourse("Java");
        s1.enrollCourse("DSA");
        s1.enrollCourse("Devops");
        s1.enrollCourse("C#");

        student s2 = new student("Aman",20,"S-12");
        s2.enrollCourse("DSA");

        student s3 = new student("Sita",23,"S-13");
        s3.enrollCourse("Devops");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        student result = findStudentById("S-10");
        System.out.println("Result : "+result);
        
        sortByName();

    }

    private static void sortByName() {
        Comparator<student> studentNameComparator = (o1,o2) -> o1.getName().compareTo(o2.getName());
        // Lambda expression is used to make you code a little bit concise and small in size and reduce the boilerplate code
          /*      new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        };*/
        Collections.sort(studentList,studentNameComparator);
        System.out.println(studentList);
    }

    public static student findStudentById(String studentId){
        student result = null;
        try {

            result = studentList.stream().filter(x -> x.getStudentId().equalsIgnoreCase(studentId))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("No Data Found!!!"));
        } catch (RuntimeException e) {
            System.err.println("Student with ID "+studentId+" Not found");
        }
        return result;
    }
}
