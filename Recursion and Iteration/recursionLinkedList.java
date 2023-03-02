import java.lang.reflect.Constructor;
import java.sql.Struct;
import java.util.LinkedList;
import java.util.function.Function;

import org.w3c.dom.Node;

import java.util.*;

class Lesson1 {
    public static void main(String[] args) {
        
        class LinkedList {
            private String data;
            private LinkedList next;

            public LinkedList(String data) {
                this.data = data;
            }
//adds data to linked list
            public void add(String data) {
                if (next == null) {
                    next = new LinkedList(data);
                } else {
                    next.add(data);
                }
            }
//displays data in linked list
            public void display() {
                System.out.print(data + " ");
                if (next != null) {
                    next.display();
                }
            }
        }
        LinkedList names = new LinkedList("Tobby");
        names.add("Sam");
        names.add("John");

        names.display(); // Output: 1 2 3

    }

} // defining node class
