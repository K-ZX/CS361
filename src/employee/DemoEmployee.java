package employee;

/**
 * @author ADD YOUR NAME
 *
 */
public class DemoEmployee {

    public static void main(String[] args) {

        
        Employee emp1 = new Employee("John", "Smith", "123456790");

        PartTimeEmployee pEmp1 = new PartTimeEmployee("Jane", "Smith", "123456777", 17.5);

        
        Employee emp3 = pEmp1;
        System.out.println("emp3:");
        emp3.whoAmI(); 

        // Explanation:
        // emp3.whoAmI() prints "I am a PartTimeEmployee" because the actual object
        // is a PartTimeEmployee, even though it's referenced as an Employee due to upcasting.
        // emp3.getHourlyRate(); causes a syntax error because Employee class does not have a method called getHourlyRate.

        
        if (emp3 instanceof PartTimeEmployee) {
            System.out.println("emp3 instance of part time employee"); // Printed
        } else {
            System.out.println("emp3 not instance of part time employee");
        }

        // Downcasting 1 (Incorrect Downcasting - Will throw ClassCastException)
        // Uncommenting this line will result in a ClassCastException at runtime because emp1 is not an instance of PartTimeEmployee.
        // PartTimeEmployee pEmp3 = (PartTimeEmployee) emp1;

        // Explanation:
        // This instruction compiles because downcasting is syntactically valid, but it throws a ClassCastException at runtime because `emp1`
        // is not a `PartTimeEmployee`. This error occurs when we try to cast an object that is not of the target type.

        // Downcasting 2 (Correct Downcasting with instanceof check)
        if (emp3 instanceof PartTimeEmployee) {
            System.out.println("emp3 instance of part time employee"); 
            PartTimeEmployee pEmp4 = (PartTimeEmployee) emp3; 
            System.out.println(pEmp4.getHourlyRate()); 
        } else {
            System.out.println("emp3 not instance of part time employee");
        }
    }
}
