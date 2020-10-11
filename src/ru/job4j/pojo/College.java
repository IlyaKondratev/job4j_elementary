package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan Ivanovich");
        student.setGroupNum(212);
        student.setAdmissionDate(new Date());
        System.out.println(student.getFullName() + " is a student from the group "
                            + student.getGroupNum() + ". The admission date is "
                            + student.getAdmissionDate());
    }
}
