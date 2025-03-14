package oops.Encapsulation;

public class Student {
    
    public int id;
    private String name;
    protected int age;

    public String getName() { // known as getter => a layer through which only modify private member
        return this.name;
    }
    public void setName(String name) { // known as setter => a layer through which only modify private member
        this.name = name;
    }


}
