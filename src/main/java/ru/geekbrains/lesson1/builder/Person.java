package ru.geekbrains.lesson1.builder;

public class Person {

    private String FirstName;
    private String LastName;
    private String MiddleName;
    private String Country;
    private String Address;
    private String Phone;
    private int Age;
    private String Gender;

    public Person(PeronBuilder peronBuilder) {
        this.FirstName = peronBuilder.FirstName;
        this.LastName = peronBuilder.LastName;
        this.MiddleName = peronBuilder.MiddleName;
        this.Country = peronBuilder.Country;
        this.Address = peronBuilder.Address;
        this.Phone = peronBuilder.Phone;
        this.Age = peronBuilder.Age;
        this.Gender = peronBuilder.Gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", LastName='" + LastName + '\'' +
                ", MiddleName='" + MiddleName + '\'' +
                ", Country='" + Country + '\'' +
                ", Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Age=" + Age +
                ", Gender='" + Gender + '\'' +
                '}';
    }

    public static class PeronBuilder {
        private String FirstName;
        private String LastName;
        private String MiddleName;
        private String Country;
        private String Address;
        private String Phone;
        private int Age;
        private String Gender;

        public PeronBuilder setFirstName(String firstName) {
            FirstName = firstName;
            return this;
        }

        public PeronBuilder setLastName(String lastName) {
            LastName = lastName;
            return this;
        }

        public PeronBuilder setMiddleName(String middleName) {
            MiddleName = middleName;
            return this;
        }

        public PeronBuilder setCountry(String country) {
            Country = country;
            return this;
        }

        public PeronBuilder setAddress(String address) {
            Address = address;
            return this;
        }

        public PeronBuilder setPhone(String phone) {
            Phone = phone;
            return this;
        }

        public PeronBuilder setAge(int age) {
            Age = age;
            return this;
        }

        public PeronBuilder setGender(String gender) {
            Gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
