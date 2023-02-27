package com.paultraynor.lil.sbet.landon.roomwebapp.models;

public enum Position {
    SECURITY, MANAGER, FRONT_DESK, CHEF;

    public String toString() {
        switch (this) {
            case SECURITY:
                return "Security";
            case MANAGER:
                return "Manager";
            case FRONT_DESK:
                return "Front Desk";
            case CHEF:
                return "Chef";
            default:
                return "";
        }
    }
}
