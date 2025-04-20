package ex_SDET_Coding_Questions.April_19_2025;

public class Task43_Encapsulation {
    public static void main(String[] args) {
        // person object created
        Person p = new Person();
        p.setName("John");
        p.setAge(30,true);
        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
    }
}
class Person{
    private String name;
    private int age;

    public void cloth(){
        System.out.println("Wear Indian");
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

    public void setAge(int age, boolean admin) {
      if(admin == true){
          this.age = age;
      }else{
          System.out.println("Not allwoed to access");
      }

    }
}