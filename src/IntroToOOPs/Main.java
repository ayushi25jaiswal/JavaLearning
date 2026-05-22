package IntroToOOPs;

public class Main {
    static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.age = 19;
        s1.id = 1;
        s1.name = "Naman" ; //default is accessible within same package;
        s1.attendClass();
//        s2 = s1; // s1 and s2 are reference variable, points to the object , points to same object now
//        s2.age = 17;
//        s2.attendClass();
//        System.out.println(s1.age);

        Batch b1 = new Batch();

//        b1.Batch_id = 1; // batch_id is private can't be used outside class
        b1.SetBatch(1);
        b1.GetBatch();
    }
}
