package ex_Task.Encapsulation;

public class ATBStudentArray {
    public static void main(String[] args) {
        // Create an array to store ATB students
        ATB1[] students = new ATB1[3];

        // Add student objects
        students[0] = new ATB1(1, "Alice", "Java");
        students[1] = new ATB1(2, "Bob", "Python");
        students[2] = new ATB1(3, "Charlie", "Selenium");

        // Print all students
        System.out.println("ATB Students List:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]); // toString() will be called automatically
        }
    }
}
