package ex_Task.Encapsulation;

public class Inheritance {
    public static void main(String[] args) {
        System.out.println("--- Single Inheritance ---");
        Course course = new Course(1, "Alice", "Java");
        course.displayCourse();

        System.out.println("\n--- Multilevel Inheritance ---");
        Batch batch = new Batch(2, "Bob", "Python", "Morning");
        batch.displayBatch();

        System.out.println("\n--- Hierarchical Inheritance ---");
        Trainer trainer = new Trainer(3, "Charlie", "Selenium");
        trainer.displayTrainer();
    }
}
// Base class (Single Inheritance)
class ATB {
    private int id;
    private String name;

    public ATB(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

// Derived class (Single Inheritance)
class Course extends ATB {
    private String courseName;

    public Course(int id, String name, String courseName) {
        super(id, name);
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayCourse() {
        super.display();
        System.out.println("Course: " + courseName);
    }
}

// Multilevel Inheritance
class Batch extends Course {
    private String batchTiming;

    public Batch(int id, String name, String courseName, String batchTiming) {
        super(id, name, courseName);
        this.batchTiming = batchTiming;
    }

    public void displayBatch() {
        displayCourse();
        System.out.println("Batch Timing: " + batchTiming);
    }
}

// Hierarchical Inheritance
class Trainer extends ATB {
    private String subject;

    public Trainer(int id, String name, String subject) {
        super(id, name);
        this.subject = subject;
    }

    public void displayTrainer() {
        display();
        System.out.println("Subject: " + subject);
    }
}