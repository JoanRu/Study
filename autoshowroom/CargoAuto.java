package com.autoshowroom;

import java.time.LocalDate;

public class CargoAuto extends Auto {
        private String date;
        public void init() {
            date = new java.util.Date().toString();
        }
    private int carIssueDate;
    private int technicalCondition;
    private int manufacturer;
    private int loadCapacity;

    public CargoAuto(int carIssueDate, int technicalCondition, int manufacturer, int loadCapacity) {
        this.carIssueDate = carIssueDate;
        this.technicalCondition = technicalCondition;
        this.manufacturer = manufacturer;
        this.loadCapacity = loadCapacity;
    }
    public static CargoAuto getCargoAssessedValue (CargoAuto[] cargoAutos) {
        CargoAuto result = cargoAutos[0];


    }
}
