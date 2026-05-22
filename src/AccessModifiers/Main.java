package AccessModifiers;

import IntroToOOPs.Student;

public class Main {
    static void main(String[] args) {
        Student s3 = new Student();

//        s3.name = "Aakash"; //default members and methods are not accessible outside package;
        s3.age = 21; // public can be accessed anywhere;
    }
}
