package com.example.htqldtPTIT.services.impl;

import com.example.htqldtPTIT.entities.DiemThi;
import com.example.htqldtPTIT.entities.MonHoc;
import com.example.htqldtPTIT.repositories.IDiemThiRepo;
import com.example.htqldtPTIT.repositories.IMonHocRepo;
import com.example.htqldtPTIT.services.IDiemThiService;
import com.example.htqldtPTIT.services.IMonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class MonHocService implements IMonHocService {

    @Autowired
    private IMonHocRepo MonHocRepo;

    @Override
    public ArrayList<MonHoc> getAll() {
        ArrayList<MonHoc> list = new ArrayList<>();
        Iterable it = MonHocRepo.findAll();
        for(Object MonHoc: it){
            list.add((MonHoc) MonHoc);
        }
        return list;
    }

    @Override
    public Optional<MonHoc> getById(int id) {
        return MonHocRepo.findById(id);
    }

    @Override
    public MonHoc save(MonHoc MonHoc) {
        return MonHocRepo.save(MonHoc);
    }

    @Override
    public void delete(int id) {
        MonHocRepo.deleteById(id);
    }
}
