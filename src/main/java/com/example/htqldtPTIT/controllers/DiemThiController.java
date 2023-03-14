package com.example.htqldtPTIT.controllers;

import com.example.htqldtPTIT.entities.DiemThi;
import com.example.htqldtPTIT.services.IDiemThiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/xem-diem-thi")
public class DiemThiController {

    @Autowired
    private IDiemThiService DiemThiService;

    @GetMapping("")
    public ResponseEntity<ArrayList<DiemThi>> getAllDiemThi() {
        return new ResponseEntity<>(DiemThiService.getAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<DiemThi> add(@RequestBody DiemThi DiemThi){
        return new ResponseEntity<>(DiemThiService.save(DiemThi), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DiemThi> edit(@PathVariable int id){
        DiemThi DiemThi = DiemThiService.getById(id).get();
        if(DiemThi != null){
            return new ResponseEntity<>(DiemThi, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /*@GetMapping("/{id}")
    public ResponseEntity<DiemThi> getDiemThi(@PathVariable int id) {
        Optional<DiemThi> DiemThiOptional = DiemThiService.getById(id);
        return DiemThiOptional.map(DiemThi -> new ResponseEntity<>(DiemThi, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }*/

    @PutMapping("/{id}")
    public ResponseEntity<DiemThi> doEdit(@PathVariable("id") int id, @RequestBody DiemThi DiemThi) {
        DiemThi DiemThiNew = DiemThiService.getById(id).get();
        if(DiemThiNew != null){
            DiemThi.setId(DiemThiNew.getId());
            DiemThi DiemThiObject = DiemThiService.save(DiemThi);
            return new ResponseEntity<>(DiemThiObject, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<DiemThi> deleteDiemThi(@PathVariable int id) {
        DiemThi DiemThiNew = DiemThiService.getById(id).get();
        if(DiemThiNew != null){
            DiemThiService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
