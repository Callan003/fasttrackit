package org.fasttrackit.curs22;

import org.fasttrackit.curs22.domani.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public PersonService(PeopleReader reader) {
        reader.read().forEach(this::add);
    }
    public List<Person> getAll(){return Collections.unmodifiableList(persons);}

    public Person add(Person person) {
        Person newPerson = new Person(persons.size() + 1, person.getName(), person.getAge(), person.getCity());
        persons.add(newPerson);
        return newPerson;
    }

    public Person replace(int id, Person person) {
        Person personToReplace = this.getOrThrow(id);

        persons.remove(personToReplace);
        Person newPerson = new Person (id, person.getName(), person.getAge(), person.getCity());
        persons.add(id-1, newPerson);
        return newPerson;
    }

    private Person getOrThrow(final int id){
        return persons.stream()
                .filter(p->p.getId() == id)
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Could not find person with id: " + id));
    }

    public Person delete(int id) {
        Person personToDelete = this.getOrThrow(id);
        persons.remove(personToDelete);
        return personToDelete;
    }
}
