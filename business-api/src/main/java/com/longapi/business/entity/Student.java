package com.longapi.business.entity;

import lombok.*;

import javax.persistence.*;


@Data
@Entity
@Getter
@Setter
@AllArgsConstructor   // Tao Constructor day du thuoc tinh
@NoArgsConstructor    // Tao Constructor rong
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "dob")
    private String dob;

    @Column(name = "gender")
    private String gender;


}
