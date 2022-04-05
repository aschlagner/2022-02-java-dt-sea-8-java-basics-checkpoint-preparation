package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

public class ITPersonRepair {

    public static String repairName(ITPerson person) {
        // Get the name of the ITPerson, repair it and return the new name
        // EG: person.getName() -> "Super_Admin" -> return "Super Admin"
        String[] names = person.getName().split("_");
        return names[0] + " " + names[1];
    }
}
