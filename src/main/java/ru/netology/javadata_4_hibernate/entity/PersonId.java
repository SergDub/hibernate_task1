package ru.netology.javadata_4_hibernate.entity;

import java.io.Serializable;

@Data
public class PersonId implements Serializable {
    private String name;
    private String surname;
    private int age;

}
