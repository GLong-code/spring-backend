package com.longapi.business.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Getter
@Setter
@Table(name = "classroom")
@NoArgsConstructor
@AllArgsConstructor
public class ClassRoom {

    @Id
    @Column(name = "idClass")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idClass;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "classRoom" , cascade = CascadeType.ALL)
    private Collection<Student> students;

}
