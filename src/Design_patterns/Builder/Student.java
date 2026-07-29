package Design_patterns.Builder;

public class Student {

    private String firstName;
    private String lastName;
    private String phone;
    private double psp;
    private String city;
    private String Address;
    private int age;
    private int batch_id;

    public static StudentHelper getBuilder(){
        return new StudentHelper();
    }

    private Student(StudentHelper studentH){
        if(studentH.getFirstName() == null || studentH.getLastName()== null){
            throw new IllegalStateException();
        }
        this.firstName = studentH.firstName;
        this.Address = studentH.Address;
        this.age = studentH.age;

    }



    static class StudentHelper{
        private String firstName;
        private String lastName;
        private String phone;

        private double psp;
        private String city;
        private String Address;
        private int age;
        private int batch_id;

        public Student build() throws Exception{
            if(this.getFirstName() == null || this.getLastName()== null){
                throw new Exception("First Name & Last Name cannot be null");
            }

            return new Student(this);
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPhone() {
            return phone;
        }

        public double getPsp() {
            return psp;
        }

        public String getCity() {
            return city;
        }

        public String getAddress() {
            return Address;
        }

        public int getAge() {
            return age;
        }

        public int getBatch_id() {
            return batch_id;
        }

        public StudentHelper setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public StudentHelper setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public StudentHelper setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public StudentHelper setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public StudentHelper setCity(String city) {
            this.city = city;
            return this;
        }

        public StudentHelper setAddress(String address) {
            Address = address;
            return this;
        }

        public StudentHelper setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentHelper setBatch_id(int batch_id) {
            this.batch_id = batch_id;
            return this;
        }
    }
}
