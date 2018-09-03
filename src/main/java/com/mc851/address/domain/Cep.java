package com.mc851.address.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Table
@Entity
public class Cep {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    private Integer value;
}
