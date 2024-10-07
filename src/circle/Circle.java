package circle;

/**
 * @author ADD YOUR NAME
 *
 */
public class Circle extends GraphicObject implements Cloneable {

    // No use of encapsulation
    public double centerX, centerY;
    public double radius;
    public int windowNumber;

    /**
     * Default constructor
     */
    public Circle() {
    }

    // Overridden method from GraphicObject
    @Override
    void draw() {
        System.out.println("Drawing a Circle...");
    }

    // Overloaded method in Circle
    public void draw(int color) {
        System.out.println("Drawing a Circle in color...");
    }

    public double circumference() {
        return 2.0 * 3.141529 * radius;
    }

    public double area() {
        return 3.141529 * radius * radius;
    }

    public boolean overlaps(Circle other) {
        return ((centerX - other.centerX) * (centerX - other.centerX)
                + (centerY - other.centerY) * (centerY - other.centerY)) < ((radius + other.radius)
                * (radius + other.radius));
    }

    @Override
    void moveTo(int newX, int newY) {
    }

    // Completed toString method
    @Override
    public String toString() {
        return "Circle: centerX = " + centerX + " centerY = " + centerY + " radius = " + radius;
    }

    // Completed equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Circle other = (Circle) obj;
        return centerX == other.centerX && centerY == other.centerY && radius == other.radius;
    }

    // Completed clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Circle cloned = (Circle) super.clone();
        return cloned;
    }
}
