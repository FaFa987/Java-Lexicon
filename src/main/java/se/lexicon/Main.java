package se.lexicon;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      Person simon = new Person();
       simon.firstName = "Simon";
       simon.lastName = "Jefri";
       simon.age = 40;
       simon.hobby = "JYM";
       System.out.println(simon.getInformation());


      Person john = new Person();
        john.firstName = "John";
        john.lastName = "rask";
        System.out.println(john.getInformation());

    } // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
}