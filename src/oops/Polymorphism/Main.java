package oops.Polymorphism;

public class Main {
    public static void main(String[] args) {
        // Circle circle = new Circle(); // this will try to call draw() from Circle class if draw() is not present in Circle class then it will call draw() from shape class
        // circle.draw();
        // Rect rect = new Rect();
        // rect.draw();

        // Dynamic method dispatch [upcasting]
        Circle circle = new Circle();
        doDrawing(circle); 

        Rect rect = new Rect();
        doDrawing(rect);
    }

    
    public static void doDrawing(Shape s) { // upcasting => this will call relaviant draw() method from the class
        s.draw(); //Polymorphic method
    }
}
