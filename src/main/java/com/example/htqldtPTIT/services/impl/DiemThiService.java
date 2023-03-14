package com.example.htqldtPTIT.services.impl;

import com.example.htqldtPTIT.entities.DiemThi;
import com.example.htqldtPTIT.repositories.IDiemThiRepo;
import com.example.htqldtPTIT.services.IDiemThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DiemThiService implements IDiemThiService {

    @Autowired
    private IDiemThiRepo DiemThiRepo;

    @Override
    public ArrayList<DiemThi> getAll() {
        ArrayList<DiemThi> list = new ArrayList<>();
        Iterable it = DiemThiRepo.findAll();
        for(Object DiemThi: it){
            list.add((DiemThi) DiemThi);
        }
        return list;
    }

    @Override
    public Optional<DiemThi> getById(int id) {
        return DiemThiRepo.findById(id);
    }

    @Override
    public DiemThi save(DiemThi DiemThi) {
        return DiemThiRepo.save(DiemThi);
    }

    @Override
    public void delete(int id) {
        DiemThiRepo.deleteById(id);
    }
}
