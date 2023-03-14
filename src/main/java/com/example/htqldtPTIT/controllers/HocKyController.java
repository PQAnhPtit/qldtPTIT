package com.example.htqldtPTIT.controllers;

import com.example.htqldtPTIT.entities.HocKy;
import com.example.htqldtPTIT.services.IHocKyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/xem-hoc-ky")
public class HocKyController {

    @Autowired
    private IHocKyService HocKyService;

    @GetMapping("")
    public ResponseEntity<ArrayList<HocKy>> getAllHocKy() {
        return new ResponseEntity<>(HocKyService.getAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<HocKy> add(@RequestBody HocKy HocKy){
        return new ResponseEntity<>(HocKyService.save(HocKy), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HocKy> edit(@PathVariable int id){
        HocKy HocKy = HocKyService.getById(id).get();
        if(HocKy != null){
            return new ResponseEntity<>(HocKy, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /*@GetMapping("/{id}")
    public ResponseEntity<HocKy> getHocKy(@PathVariable int id) {
        Optional<HocKy> HocKyOptional = HocKyService.getById(id);
        return HocKyOptional.map(HocKy -> new ResponseEntity<>(HocKy, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }*/

    @PutMapping("/{id}")
    public ResponseEntity<HocKy> doEdit(@PathVariable("id") int id, @RequestBody HocKy HocKy) {
        HocKy HocKyNew = HocKyService.getById(id).get();
        if(HocKyNew != null){
            HocKy.setId(HocKyNew.getId());
            HocKy HocKyObject = HocKyService.save(HocKy);
            return new ResponseEntity<>(HocKyObject, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HocKy> deleteHocKy(@PathVariable int id) {
        HocKy HocKyNew = HocKyService.getById(id).get();
        if(HocKyNew != null){
            HocKyService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
