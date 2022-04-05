package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;

public class Admin extends ITPerson {

    protected LocalDate lastCertified;

    public Admin(String name, LocalDate lastCertified) {
        super(name);
        this.lastCertified = lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
    }

    @Override
    public boolean hasReadAccess() {
        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        if (this.lastCertified.isAfter(LocalDate.now().minusYears(1).minusDays(1))) {
            return true;
        } else {
        return false;
        }
    }
}
