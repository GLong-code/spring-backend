package com.longapi.business.entity;


import lombok.*;

import javax.persistence.*;

@Data
@Entity(name = "teacher")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "teacher")
public class Teacher {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "phoneNum")
    private String phoneNum;

    @Column(name = "gender")
    private String gender;


}
