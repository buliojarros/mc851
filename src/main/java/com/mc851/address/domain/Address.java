package com.mc851.address.domain;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Table
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Cep cep;
    @Column
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Street> street;
    @Column
    private Integer minNumber;
    @Column
    private Integer maxNumber;
}
