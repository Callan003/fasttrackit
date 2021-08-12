package ro.fasttrackit.curs21.web;

import ro.fasttrackit.curs21.web.domain.Person;

import java.util.List;

public class PersonReader {
    public List<Person> readPersons(){
        return List.of(
                new Person("Maria", 18),
                new Person("Ioana", 21),
                new Person("Campioana", 99));
    }
}
