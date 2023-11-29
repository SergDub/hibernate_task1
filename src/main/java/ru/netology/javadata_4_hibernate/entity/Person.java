package ru.netology.javadata_4_hibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Column;
import java.io.Serializable;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persons")
@Entity
@IdClass(PersonId.class)
public class Person implements Serializable {
    @Id
    @Column(name = "name")
    private String name;

    @Id
    @Column(name = "surname")
    private String surname;

    @Id
    @Column(name = "age")
    private int age;

    @Column(name = "phone_number")
    private int phoneNumber;

    @Column(name = "city_of_living")
    private String cityOfLiving;
}
