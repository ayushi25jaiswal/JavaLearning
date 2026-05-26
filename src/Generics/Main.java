package Generics;

public class Main {

    static void main(String[] args) {

        Pair p = new Pair();

        //let first be name-> String, second be psp-> double
        p.setFirst("Ayushi");
        p.setSecond(9.0);

        p.setFirst(10);//it is not giving error as you cant be strict on the type using Object.

    }
}
