package com.example.htqldtPTIT.services;

import com.example.htqldtPTIT.entities.DiemThi;
import com.example.htqldtPTIT.entities.HocKy;

import java.util.ArrayList;
import java.util.Optional;

public interface IHocKyService {
    ArrayList<HocKy> getAll();
    Optional<HocKy> getById(int id);
    HocKy save(HocKy HocKy);
    void delete(int id);
}
