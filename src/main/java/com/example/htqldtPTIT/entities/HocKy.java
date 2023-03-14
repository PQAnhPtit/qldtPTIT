package com.example.htqldtPTIT.entities;

import lombok.Data;

import javax.persistence.*;

@Table(name = "hoc_ky")
@Entity
@Data
public class HocKy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "maHK")
    private String maHK;

    @Column(name = "tenHK")
    private String tenHK;
}
