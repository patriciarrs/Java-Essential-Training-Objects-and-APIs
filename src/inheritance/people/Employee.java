package inheritance.people;

public class Employee extends Person {

    private String employeeId;
    private String title;

    /*
    - A superclasses constructor is run before the subclass's constructor.
    - An explicit call can be made to the superclasses' constructor from one of the subclass constructors by using super().
    - An explicit call to the superclasses' constructor must be the first statement in the subclass constructor.
    - If the superclass does not have a default constructor, but has another constructor(s), the subclass must explicitly call one of the other constructors.
    */

    public Employee() {
        super("John Doe");
        System.out.println("In Employee default constructor");
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
