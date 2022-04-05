package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.util.ArrayList;
import java.util.List;

public class GenericStorage<T> {

    // Attributes
    private List<T> persons;

    // Constructor
    public GenericStorage() {
        this.persons = new ArrayList<>();
    }

    // "Setter & Getter" for List entries
    public boolean storePerson(T object) {
        return this.persons.add(object);
    }

    public T getLastStoredPerson() {
        return this.persons.get(persons.size()-1);
    }

    public T getFirstStoredPerson() {
        return this.persons.get(0);
    }

}
