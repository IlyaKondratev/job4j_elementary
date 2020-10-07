package ru.job4j.oop;

import java.time.LocalDate;

public class Doctor {

    private boolean latinKnowledge;
    private LocalDate appointmentTimeBegin;
    private LocalDate appointmentTimeEnd;

    public Diagnosis heal(Patient patient) {
        return new Diagnosis();
    }
}
