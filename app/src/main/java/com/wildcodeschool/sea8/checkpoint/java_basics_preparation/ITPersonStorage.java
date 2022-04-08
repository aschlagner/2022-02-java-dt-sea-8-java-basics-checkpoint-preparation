package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.util.ArrayList;
import java.util.List;

/**
 * This class implements a ITPerson storage on Object base, ie. without Generics.
 */
public class ITPersonStorage {

    List persons = new ArrayList<>();

    public boolean storePerson(Object person) {
        return persons.add(person);
    }

    public Object getLastStoredPerson() {
        return persons.get(persons.size()-1);
    }

    public Object getFirstStoredPerson() {
        return persons.get(0);
    }

}
