package se.lexicon;

public class Person {
    String firstName;
    String lastName;
    int age;
    String hobby;

    public String getInformation() {
        String personData = "First Name: " + firstName + ", Last Name: " + lastName;
        return personData;
    }
}
