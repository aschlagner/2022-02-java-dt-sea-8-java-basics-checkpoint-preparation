package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;

public class Developer extends ITPerson {

    protected LocalDate employmentDate;

    public Developer(String name, LocalDate employmentDate) {
        super(name);
        this.employmentDate = employmentDate;
    }

    @Override
    public boolean hasReadAccess() {
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        if (LocalDate.now().minusMonths(6).isAfter(this.employmentDate)) {
            return true;
        } else {
        return false;
        }
    }
}
