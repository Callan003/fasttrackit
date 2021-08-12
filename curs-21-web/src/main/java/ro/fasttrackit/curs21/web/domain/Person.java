package ro.fasttrackit.curs21.web.domain;

import java.util.Objects;

public class Person {
    private static int COUNT = 0;
    private final int id;
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.id = COUNT ++;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "Person='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
