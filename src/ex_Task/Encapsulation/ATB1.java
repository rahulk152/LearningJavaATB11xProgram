package ex_Task.Encapsulation;

public class ATB1 {
    // Private fields (Encapsulation)
    private int id;
    private String name;
    private String course;

    // Constructor
    public ATB1(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    // Getter and Setter for id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for course
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "ATB { ID: " + id + ", Name: '" + name + "', Course: '" + course + "' }";
    }
}
