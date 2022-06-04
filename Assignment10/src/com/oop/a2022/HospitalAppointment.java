package com.oop.a2022;
import java.time.LocalDateTime;

public class HospitalAppointment {
    Doctor d;
    Patient p;
    String time;
    public HospitalAppointment(Doctor d, Patient p, LocalDateTime t){
        this.d = d;
        this.p = p;
        this.time = t.toString();
    }

    @Override
    public String toString() {
        return "HospitalAppointment: "+time+" \n"+d.toString()+"\n"+p.toString();
    }
}
