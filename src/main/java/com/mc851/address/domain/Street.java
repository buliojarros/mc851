package com.mc851.address.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Street {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String street;
    @Column
    private String province;
    @Column
    private String city;
    @Column
    private String state;
    @Column
    private String country;
}
