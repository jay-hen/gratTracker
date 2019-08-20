package com.jesshenry.grattracker.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Grat {

    @Id
    @GeneratedValue
    private int id;

    private Double totalTips = 00.00;

    private Double hoursWorked = 00.00;

    public Grat() { }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotalTips() {
        return totalTips;
    }

    public void setTotalTips(Double totalTips) {
        this.totalTips = totalTips;
    }

    public Double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(Double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
