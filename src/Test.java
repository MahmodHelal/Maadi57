public class Test {

    public String testMethod(){
    String firstName = "Helal";
    String lastName = "sh";
    String fullName = firstName + " " + lastName;

    return fullName;
    }
    public void anotherTestMethod() {
        System.out.println("Hello from another test method");
        testMethod();

    }
}
