package Design_patterns.Prototype;

public class Client {

    static void main(String[] args) {
        VMInstance v1 = new VMInstance("V1_instance","linux", true, "30GB");

        VMInstance v2 = new VMInstance(v1);

        VMInstance v3 = new GPUInstance(v1, "8GB");


//VMInstance copy = new VMInstance(original); this is the issue it is reading it in this way
        System.out.println(v3.getRam());
    }
}
