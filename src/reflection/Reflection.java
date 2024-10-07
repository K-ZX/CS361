package reflection;

import java.lang.reflect.Method;

/**
 * @author Omar Alcantar
 *
 */


public class Reflection {


    public void correspondingClass(Object o) {
        if (o == null)
            throw new IllegalArgumentException("Object passed is null");

        System.out.println("Inspecting class: " + o.getClass().getName());
    }


    public void inheritanceChain(Object o) {
        if (o == null)
            throw new IllegalArgumentException("Object passed is null");

        Class<?> currentClass = o.getClass();
        System.out.print("Inheritance chain: ");
        while (currentClass != null) {
            System.out.print(currentClass.getName());
            currentClass = currentClass.getSuperclass();
            if (currentClass != null) {
                System.out.print(" inherits from ");
            }
        }
        System.out.println();
    }


    public void listMethods(Object o) {
        if (o == null)
            throw new IllegalArgumentException("Object passed is null");

        Method[] methods = o.getClass().getMethods();

       
        System.out.println("\nList of methods:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }


    public Reflection() {
    }


    public static void main(String[] args) {

        Reflection r = new Reflection();

        
        String str = "Hello, Reflection!";
        System.out.println("String object:");
        r.correspondingClass(str);
        r.inheritanceChain(str);
        r.listMethods(str);

        
        ColoredCircle cc = new ColoredCircle(0, 0, 10, "Red");
        System.out.println("\nColoredCircle object:");
        r.correspondingClass(cc);
        r.inheritanceChain(cc);
        r.listMethods(cc);
    }
}


class ColoredCircle {
    private int x, y;
    private int radius;
    private String color;

    public ColoredCircle(int x, int y, int radius, String color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
    }

    public void draw() {
        System.out.println("Drawing a " + color + " circle.");
    }

    public void moveTo(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    // Getters and setters can be added here if needed
}
