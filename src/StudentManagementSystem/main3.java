package StudentManagementSystem;

import java.util.*;

public class main3 {
    private static List<student> studentList;
    public static void main(String[] args) {
        System.out.println("********** Student Management System **********");
        System.out.println("********** Welcome **********");
        studentList = new ArrayList<student>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        String name = scanner.next();//If you want to read the input in string format we use the next()
        System.out.println("You have entered name "+name);
        System.out.println("Enter Student Age : ");
        int age = scanner.nextInt();//If you want to read the input in int format, we use the nextInt()
        System.out.println("The student age is "+age);
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
