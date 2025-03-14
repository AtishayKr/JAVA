package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Main {
 
    public static void main(String[] args) {
        
        // ArrayList<Integer> Array = new ArrayList<>();

        // Array.add(5); //default method of collection interface
        // Array.add(5);
        // Array.add(5);
        // Array.add(5);
        // System.out.println(Array);
        // Array.remove(2); //default method of collection interface
        // System.out.println(Array);

        // ArrayList<Integer> Array2 = new ArrayList<>();
        // Array2.add(1);
        // Array2.add(2);
        // Array2.add(3);
        // System.out.println(Array2);
        // Array.addAll(Array2); //default method of collection interface
        // System.out.println(Array);
        // Array.removeAll(Array2); //default method of collection interface
        // System.out.println(Array);
        // System.out.println(Array.size()); //default method of collection interface
        // System.out.println(Array.isEmpty()); //default method of collection interface
        // System.out.println(Array.contains(5)); //default method of collection interface

        // Iterator<Integer> it = Array.iterator(); //default method of collection interface
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        // Array.clear(); //default method of collection interface
        // System.out.println(Array);


        // List specific methods
        ArrayList<Integer> Array3 = new ArrayList<>();
        Array3.add(1);
        Array3.add(2);
        Array3.add(3);
        Array3.add(4);
        System.out.println(Array3.get(3)); //List specific method
        Array3.set(3, 5);
        System.out.println(Array3.get(3)); //List specific method
        
        //sort method
        Collections.sort(Array3);
        System.out.println(Array3);

        ArrayList<Integer> Array4 = (ArrayList<Integer>)Array3.clone();
        System.out.println(Array4);


    }
}
