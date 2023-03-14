package com.example.htqldtPTIT.services;

import com.example.htqldtPTIT.entities.DiemThi;
import com.example.htqldtPTIT.entities.MonHoc;

import java.util.ArrayList;
import java.util.Optional;

public interface IMonHocService {
    ArrayList<MonHoc> getAll();
    Optional<MonHoc> getById(int id);
    MonHoc save(MonHoc MonHoc);
    void delete(int id);
}
