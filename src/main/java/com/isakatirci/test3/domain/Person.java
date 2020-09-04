package com.isakatirci.test3.domain;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    @Column(updatable = false)
    private String fistName;
    private String lastName;

    @Temporal(value = TemporalType.DATE)
    private Date createdDate;

    @Lob
    private String description;

    @Embedded
    private School school;


}
