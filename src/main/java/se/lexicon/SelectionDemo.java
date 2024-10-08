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
        int dayOfWeek = 3;
            switch (dayOfWeek) {
                case 1:
                    System.out.println("It is Monday");
                    break;
                case 2:
                     Sys nm,tem.out.println("It is Teusday");
                     break;
                case 3:
                    System.out.println("It is Wendsday");
                    break;
                case 4:
                    System.out.println("It is Thursday");
                    break;
                case 5:
                    System.out.println("It is Friday");
                    break;
                default:
                    System.out.println("It is weekend");
            }
        }
    }

