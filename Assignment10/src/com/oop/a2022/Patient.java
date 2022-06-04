package com.oop.a2022;
import java.util.Date;

public class Patient {
    private String name;
    private String id;
    public Patient(String name){
        this.name = name;
        Date d = new Date();
        long t = d.getTime();
        this.id = t+name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Patient: name: "+name+" id: "+id;
    }
}
