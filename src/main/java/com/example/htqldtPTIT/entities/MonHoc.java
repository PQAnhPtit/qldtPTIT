package com.example.htqldtPTIT.entities;

import lombok.Data;

import javax.persistence.*;

@Table(name = "mon_hoc")
@Entity
@Data
public class MonHoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tenMH")
    private String tenMH;

    @Column(name = "soTC")
    private int soTC;

    @Column(name = "pCC")
    private int pCC;

    @Column(name = "pKT")
    private int pKT;

    @Column(name = "pBT")
    private int pBT;

    @Column(name = "pTH")
    private int pTH;

    @Column(name = "thi")
    private int pThi;

    @Column(name = "hk_id")
    private int hk_id;
}
