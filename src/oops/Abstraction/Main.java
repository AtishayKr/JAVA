package oops.Abstraction;

// abstract class Bird { // abstract class => It can not be directly instantiated
//     abstract void fly(); // abstract method => no body and must be implemented by the child class
//     abstract void eat();
// }

// class Sparrow extends Bird {
//     void fly() {
//         System.out.println("Sparrow is flying");
//     }

//     void eat() {
//         System.out.println("Sparrow is eating");
//     }
// }

// class Pigeon extends Bird {
//     void fly() {
//         System.out.println("Pigeon is flying");
//     }

//     void eat() {
//         System.out.println("Pigeon is eating");
//     }
// }

// public class Main {

//     public static void doBirdStuff(Bird bird) {
//         bird.fly();
//         bird.eat();
//     }
    
//     public static void main(String[] args) {
//         // Bird bird = new Bird()  // This will give an error as we can not instantiate an abstract class
//         // Bird sparrow = new Sparrow();
//         // sparrow.fly();
//         // sparrow.eat();

//         // Bird pigeon = new Pigeon();
//         // pigeon.fly();
//         // pigeon.eat();

//         doBirdStuff(new Sparrow());
//         doBirdStuff(new Pigeon());
//     }
// }



// Using Interface => new way of abstraction in JAVA

interface Bird { // abstract class => It can not be directly instantiated
    void fly(); // abstract method => no body and must be implemented by the child class
    void eat();
}

class Sparrow implements Bird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void eat() {
        System.out.println("Sparrow is eating");
    }
}

class Pigeon implements Bird {
    public void fly() {
        System.out.println("Pigeon is flying");
    }

    public void eat() {
        System.out.println("Pigeon is eating");
    }
}

public class Main {

    public static void doBirdStuff(Bird bird) {
        bird.fly();
        bird.eat();
    }
    
    public static void main(String[] args) {
        // Bird bird = new Bird()  // This will give an error as we can not instantiate an abstract class
        // Bird sparrow = new Sparrow();
        // sparrow.fly();
        // sparrow.eat();

        // Bird pigeon = new Pigeon();
        // pigeon.fly();
        // pigeon.eat();

        doBirdStuff(new Sparrow());
        doBirdStuff(new Pigeon());
    }
}
