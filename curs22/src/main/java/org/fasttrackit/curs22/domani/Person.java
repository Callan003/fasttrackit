package org.fasttrackit.curs22.domani;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Person {
    private final int id;
    private final String name;
    private final String city;
    private final int age;

    public Person(@JsonProperty("name") String name,
                  @JsonProperty("age") int age,
                  @JsonProperty("city") String city){
        this(0,name,age,city);
    }

    public Person(int id, String name, int age, String city) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, city, age);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }
}
