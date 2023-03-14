package com.example.htqldtPTIT.services.impl;

import com.example.htqldtPTIT.entities.DiemThi;
import com.example.htqldtPTIT.entities.HocKy;
import com.example.htqldtPTIT.repositories.IDiemThiRepo;
import com.example.htqldtPTIT.repositories.IHocKyRepo;
import com.example.htqldtPTIT.services.IDiemThiService;
import com.example.htqldtPTIT.services.IHocKyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class HocKyService implements IHocKyService {

    @Autowired
    private IHocKyRepo HocKyRepo;

    @Override
    public ArrayList<HocKy> getAll() {
        ArrayList<HocKy> list = new ArrayList<>();
        Iterable it = HocKyRepo.findAll();
        for(Object HocKy: it){
            list.add((HocKy) HocKy);
        }
        return list;
    }

    @Override
    public Optional<HocKy> getById(int id) {
        return HocKyRepo.findById(id);
    }

    @Override
    public HocKy save(HocKy HocKy) {
        return HocKyRepo.save(HocKy);
    }

    @Override
    public void delete(int id) {
        HocKyRepo.deleteById(id);
    }
}
