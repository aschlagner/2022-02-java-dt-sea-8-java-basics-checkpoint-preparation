package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

public abstract class ITPerson {

    private String id;
    protected String name;

    public ITPerson(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract boolean hasReadAccess();
    public abstract boolean hasWriteAccess();

}
