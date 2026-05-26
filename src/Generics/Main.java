package Generics;

public class Main {

    static void main(String[] args) {

        Pair p = new Pair();
  //------------------------------------------------------------------------------------------
        //let first be name-> String, second be psp-> double
        p.setFirst("Ayushi");
        p.setSecond(9.0);

        p.setFirst(10);//it is not giving error as you cant be strict on the type using Object.

 // ------------------------------------------------------------------------------------------

        GenericPair<String, Double> student = new GenericPair<>();

        student.setFirst("Ayushi");
        student.setSecond(99.0);

//        student.setFirst(90);//this will throw error at compile time only.
        //for every object you can create object with different type. But for that particular object that is fixed.
        //use for stack - storing Integer, character, string etc.


    }
}
