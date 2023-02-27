package com.paultraynor.lil.sbet.landon.roomwebapp.models;

public class Staff {

    private String employeeId;
    private String firstName;
    private String lastName;
    private Position position;

    public Staff() {

    }

    public Staff(String employeeId, String fistName, String lastName, Position position) {
        this.employeeId = employeeId;
        this.firstName = fistName;
        this.lastName = lastName;
        this.position = position;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return this.position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
