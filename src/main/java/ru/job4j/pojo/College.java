package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Иванов Иван Иванович");
        student.setGroup("Молекулярная биология");
        student.setAdmissionDate(new Date());
        System.out.println("ФИО студента: " + student.getFullName() + ". Группа: " + student.getGroup()
                + ". Дата поступления: " + student.getAdmissionDate());
    }
}
