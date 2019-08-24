package com.jesshenry.grattracker.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Grat {

    @Id
    @GeneratedValue
    private int id;

    private String hoursWorked;

    private Double hourlyWage = 00.00;

    private Double totalTips = 00.00;

    private String shiftNotes;

    public Grat() { }

    public int getId() {
        return id;
    }

    public void setId(int id) { this.id = id; }

    public String getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(String hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public Double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(Double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getTotalTips() {
        return totalTips;
    }

    public void setTotalTips(Double totalTips) {
        this.totalTips = totalTips;
    }

    public String getShiftNotes() {
        return shiftNotes;
    }

    public void setShiftNotes(String shiftNotes) {
        this.shiftNotes = shiftNotes;
    }
}
