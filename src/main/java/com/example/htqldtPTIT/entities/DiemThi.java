package com.example.htqldtPTIT.entities;

import lombok.Data;

import javax.persistence.*;

@Table(name = "diem_thi")
@Entity
@Data
public class DiemThi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "mh_id")
    private int mh_id;

    @Column(name = "dCC")
    private float dCC;

    @Column(name = "dKT")
    private float dKT;

    @Column(name = "dBT")
    private float dBT;

    @Column(name = "dTH")
    private float dTH;

    @Column(name = "thi")
    private float dThi;

    @Column(name = "dTK")
    private float dTK;

    @Column(name = "dKQ")
    private String dKQ;
}
