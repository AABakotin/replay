package ru.geekbrains.lesson1.builder;

public class Person {

    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;

    public Person(PeronBuilder peronBuilder) {
        this.firstName = peronBuilder.firstName;
        this.lastName = peronBuilder.lastName;
        this.middleName = peronBuilder.middleName;
        this.country = peronBuilder.country;
        this.address = peronBuilder.address;
        this.phone = peronBuilder.phone;
        this.age = peronBuilder.age;
        this.gender = peronBuilder.gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + firstName + '\'' +
                ", LastName='" + lastName + '\'' +
                ", MiddleName='" + middleName + '\'' +
                ", Country='" + country + '\'' +
                ", Address='" + address + '\'' +
                ", Phone='" + phone + '\'' +
                ", Age=" + age +
                ", Gender='" + gender + '\'' +
                '}';
    }

    public static class PeronBuilder {
        private String firstName;
        private String lastName;
        private String middleName;
        private String country;
        private String address;
        private String phone;
        private int age;
        private String gender;

        public PeronBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PeronBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PeronBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public PeronBuilder setCountry(String country) {
            this.country = country;
            return this;
        }

        public PeronBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public PeronBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public PeronBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public PeronBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
