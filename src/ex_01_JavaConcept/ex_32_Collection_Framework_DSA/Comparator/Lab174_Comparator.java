package ex_01_JavaConcept.ex_32_Collection_Framework_DSA.Comparator;

import java.util.Comparator;
import java.util.*;

public class Lab174_Comparator {
    public static void main(String[] args) {
        Student s1  = new Student(107,"Vijay",23);
        Student s2  = new Student(104,"Jai",21);
        Student s3  = new Student(106,"Ajay",27);

        List<Student> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

//        Collections.sort(studentList, new AgeComparator());
//        Collections.sort(studentList, new NameComparator());
        Collections.sort(studentList, new RollNoComparator());
        System.out.println(studentList);
    }
}
class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getRollNo() - s2.getRollNo();
    }
}
class Student {
    private int rollNo;
    private String name;
    private int age;

    public Student(int rollNo, String name, int age) {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
