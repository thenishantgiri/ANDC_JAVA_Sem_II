package Lab.Lab4;

public class UnderAge extends Exception {

    final private int age;

    public UnderAge(int age) {
        this.age = age;
    }

    @Override
    public String getMessage() {
        return "Error: UnderAge: Your age " + age +" is less than 18 years.";
    }
}