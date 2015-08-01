
import java.util.ArrayList;
import java.util.List;

public class Person {

    private String givenNome;
    private String surName;
    private int age;
    private Gender gender;
    private String eMail;
    private String phone;
    private String address;

    public Person(String givenNome, String surName, int age, Gender gender, String eMail, String phone, String address) {
        this.givenNome = givenNome;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.eMail = eMail;
        this.phone = phone;
        this.address = address;
    }

    public static class Builder {

        private String givenNome = "";
        private String surName = "";
        private int age = 0;
        private Gender gender = Gender.FEMALE;
        private String eMail = "";
        private String phone = "";
        private String address = "";

        public Person.Builder givenName(String giveName) {
            this.givenNome = giveName;
            return this;
        }

        public Person.Builder surName(String surName) {
            this.surName = surName;
            return this;
        }

        public Person.Builder age(int val) {
            age = val;
            return this;

        }

        public Person.Builder gender(Gender val) {
            gender = val;
            return this;
        }

        public Person.Builder email(String val) {

            eMail = val;
            return this;

        }

        public Person.Builder phoneNumber(String val) {

            phone = val;
            return this;
        }

        public Person.Builder address(String val) {

            address = val;
            return this;
        }

        public Person build() {
            return new Person();
        }
    }

    private Person() {
        super();
    }

    private Person(Person.Builder builder) {
        givenNome = builder.givenNome;
        surName = builder.surName;
        age = builder.age;
        gender = builder.gender;
        eMail = builder.eMail;
        phone = builder.phone;
        address = builder.address;

    }

    public String getGivenNome() {
        return givenNome;
    }

    public void setGivenNome(String givenNome) {
        this.givenNome = givenNome;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void print() {

        System.out.println(
                "\nName: " + givenNome + " " + surName + "\n"
                + "Age: " + age + "\n"
                + "Gender: " + gender + "\n"
                + "eMail: " + eMail + "\n"
                + "Phone: " + phone + "\n"
                + "Address: " + address + "\n");

    }

    public void printName() {
        System.out.println(
                "Name: " + givenNome + " " + surName);

    }

    @Override
    public String toString() {
        return "Name: " + givenNome + " " + surName + "\n" + "Age: " + age + "Gender: "
                + gender + "\n" + "eMail: " + eMail + "\n" + "Address: " + address + "\n";

    }

    public static List<Person> createShortList() {

        List<Person> people = new ArrayList<>();

        people.add(new Person.Builder()
                .givenName("Bob")
                .surName("Baker")
                .age(21)
                .gender(Gender.MALE)
                .email("bob.baker@example.com")
                .phoneNumber("201-121-4678")
                .address("44 4th St, Smallvile, KS 12333").build());
        
        
        people.add(new Person.Builder()
                .givenName("Jane")
                .surName("Doe")
                .age(25)
                .gender(Gender.FEMALE)
                .email("jane.doe@example.com")
                .phoneNumber("202-123-4678")
                .address("33 3th St, Smallvile, KS 12333").build());
        
        people.add(new Person.Builder()
                .givenName("John")
                .surName("Doe")
                .age(25)
                .gender(Gender.MALE)
                .email("john.doe@example.com")
                .phoneNumber("202-121-4678")
                .address("44 4th St, Smallvile, KS 12333").build());

        people.add(new Person.Builder()
                .givenName("James")
                .surName("Johnson")
                .age(45)
                .gender(Gender.MALE)
                .email("james.johnson@example.com")
                .phoneNumber("333-456-1233")
                .address("201 2nd St, New York, Ny 12111").build());
        
        people.add(new Person.Builder()
                .givenName("Joe")
                .surName("Bailey")
                .age(67)
                .gender(Gender.MALE)
                .email("joebob.bailey@example.com")
                .phoneNumber("112-111-1111")
                .address("111 1st St, Town, CA 11111").build());
        
        people.add(new Person.Builder()
                .givenName("Phil")
                .surName("Smith")
                .age(55)
                .gender(Gender.MALE)
                .email("phil.smith@example.com")
                .phoneNumber("222-33-1234")
                .address("22 2nd St, New Park, CO 222333").build());
        
        people.add(new Person.Builder()
                .givenName("Betty")
                .surName("Jones")
                .age(85)
                .gender(Gender.FEMALE)
                .email("betty.jones@example.com")
                .phoneNumber("211-33-1234")
                .address("22 4th St, New Park, CO 222333").build());
        
        return people;
    }
}
