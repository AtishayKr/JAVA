package oops.class_objects;

public class App {
    public static void main(String[] args) {
        //calling default constructor
        Student s1 = new Student();
        s1.name = "atishay";

        // System.out.println(s1.details());
        s1.details();

        //calling paramitrize constructor
        Student s2 = new Student(1, "atishay", 25);
        s2.details();


        // calling paramitrize constructor 
        Student s3 = new Student(s2);
        s3.details();
    }
}
