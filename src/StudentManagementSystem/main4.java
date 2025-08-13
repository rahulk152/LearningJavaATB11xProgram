package StudentManagementSystem;

import java.util.*;

public class main4 {
    private static List<student> studentList;
    private static Scanner scanner;
    public static void main(String[] args) {
        System.out.println("********** Student Management System **********");

        studentList = new ArrayList<student>();
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("********** Welcome **********");
            System.out.println("Select an Option : ");
            System.out.println("1. Register Student");
            System.out.println("2. Find Student with StudentId");
            System.out.println("3. List All Student Information");
            System.out.println("4. List Student Information in sorted order");
            System.out.println("5. Exit");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    enrollStudent(scanner);
                    break;
                case 2:
                    findStudentById(scanner);
                    break;
                case 3:
                    printAllStudentData();
                    break;
                case 4:
                    sortByName();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("Invalid option selected!!...Enter Between 1 to 5 option");
            }
        }
    }

    private static void exit(){
        System.exit(0);
    }

    private static void printAllStudentData() {
        if(studentList.size()>0) {
            System.out.println("------------- Print All Student Data ----------");
            for (student student : studentList) {
                student.printStudentInfo();
            }
            System.out.println("------------- ************** ----------");
        }else {
            System.err.println("Student List is Empty!! No Student record found");
        }
    }

    private static void enrollStudent(Scanner scanner) {
        System.out.println("Enter the student Name");
        String studentName = scanner.next();

        System.out.println("Enter the student Age");
        int studentAge = scanner.nextInt();

        System.out.println("Enter the student Id");
        String studentId = scanner.next();

        student newStudent = new student(studentName, studentAge, studentId);
        studentList.add(newStudent);

        while (true) {
            System.out.println("Enter the course to be enrolled!!...Type Done to exit");
            String courseName = scanner.next();
            if (courseName.equalsIgnoreCase("done")) {
                break;
            }
            newStudent.enrollCourse(courseName);
        }
        newStudent.printStudentInfo();
    }
    private static void findStudentById(Scanner scanner) {
        student studentFound = null;
        System.out.println("Enter the student Id");
        String studentId = scanner.next();
        try {

            studentFound = studentList.stream().filter(student -> student.getStudentId().equalsIgnoreCase(studentId))
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("No Data Found!!!"));
        } catch (RuntimeException e) {
            System.err.println("Student with ID "+studentId+" Not found");
        }
        studentFound.printStudentInfo();
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
        printAllStudentData();
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
