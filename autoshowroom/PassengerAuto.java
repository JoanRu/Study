package com.autoshowroom;

public class PassengerAuto extends Auto {

    private int carIssueDate;
    private int technicalCondition;
    private int manufacturer;
    private int seatingCapacity;

    public PassengerAuto(int carIssueDate, int technicalCondition, int manufacturer, int seatingCapacity) {
        this.carIssueDate = carIssueDate;
        this.technicalCondition = technicalCondition;
        this.manufacturer = manufacturer;
        this.seatingCapacity = seatingCapacity;
    }

}
