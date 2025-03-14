package oops.class_objects;

public class Student {
    public int id;
    public String name;
    public int age;

    // default constructor 
    Student () {

    };

    //paramitrize constructor
    Student (int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student s1) {
        this.id = s1.id;
        this.name = s1.name;
        this.age = s1.age;
    }

    public void details() {
        System.out.println("student id " + id);
        System.out.println("student name " + name);
        System.out.println("student age " + age);
    }
}
