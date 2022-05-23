package com.digianalytix.mobile_de.xml;

public enum ParkingAssistant {
    FRONT_SENSORS("Vorne"),
    REAR_SENSORS("Hinten"),
    REAR_VIEW_CAM("Kamera"),
    AUTOMATIC_PARKING("Selbstlenkende Systeme"),
    CAM_360_DEGREES("360°-Kamera");

    String deContent;

    ParkingAssistant(String deContent) {
        this.deContent = deContent;
    }

    public String getDeContent() {
        return deContent;
    }
}
