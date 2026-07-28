package Design_patterns.Builder;

public class Client {
    static void main(String[] args) {

        try{
            Student s1 = Student.getBuilder().setLastName("jaiswal")
                    .setAge(25).build();
            System.out.println("Object created successfully");
        }catch (Exception e){
            System.out.println("Exception "+ e.getMessage());
        }
    }
}
