package org.launchcode.techjobs.oo;

import java.util.Objects;

public class JobField {
    private int id;
    private static int nextId = 1;
    private String value;
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String value) {
        this();
        this.value = value;
    }
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField employer = (JobField) o;
        return getId() == employer.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    // Getters and Setters:

    public int getId() {
        return id;
    }

//    public String getValue() {
//        return value;
//    }
    public String getValue() {
        if (value == null || value.isEmpty()) {
            return "Data not available";
        }
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }

}
