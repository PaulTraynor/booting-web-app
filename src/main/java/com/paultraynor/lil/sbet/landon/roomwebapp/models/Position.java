package com.paultraynor.lil.sbet.landon.roomwebapp.models;

public enum Position {
    SECURITY, HOUSEKEEPING, FRONT_DESK, CONCIERGE;

    public String toString() {
        switch (this) {
            case SECURITY:
                return "Security";
            case HOUSEKEEPING:
                return "Manager";
            case FRONT_DESK:
                return "Front Desk";
            case CONCIERGE:
                return "Chef";
            default:
                return "";
        }
    }
}
