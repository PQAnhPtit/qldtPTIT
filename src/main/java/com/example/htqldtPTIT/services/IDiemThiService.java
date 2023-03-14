package com.example.htqldtPTIT.services;

import com.example.htqldtPTIT.entities.DiemThi;

import java.util.ArrayList;
import java.util.Optional;

public interface IDiemThiService {
    ArrayList<DiemThi> getAll();
    Optional<DiemThi> getById(int id);
    DiemThi save(DiemThi diemThi);
    void delete(int id);
}
