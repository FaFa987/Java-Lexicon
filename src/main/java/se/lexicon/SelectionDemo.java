package se.lexicon;

public class SelectionDemo {
    public static void main(String[] args) {
        int number = 5;
        if (number % 2 != 0) {
            System.out.println("the number is odd.");
        }
            else {
                System.out.println("the number is even.");
            }
        int studentScore = 75;
            if (studentScore >= 90) {
                System.out.println("Grade A");
            }
            else if (studentScore >= 80) {
                System.out.println("Grade B");
            }
            else if (studentScore >= 70) {
                System.out.println("Grade C");
            } else {
                System.out.println("Grade F");
            }
        }
    }

