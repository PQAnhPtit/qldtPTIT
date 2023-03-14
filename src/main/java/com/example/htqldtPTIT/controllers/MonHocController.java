package com.example.htqldtPTIT.controllers;

import com.example.htqldtPTIT.entities.DiemThi;
import com.example.htqldtPTIT.entities.MonHoc;
import com.example.htqldtPTIT.services.IDiemThiService;
import com.example.htqldtPTIT.services.IMonHocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/xem-mh")
public class MonHocController {

    @Autowired
    private IMonHocService MonHocService;

    @GetMapping("")
    public ResponseEntity<ArrayList<MonHoc>> getAllMonHoc() {
        return new ResponseEntity<>(MonHocService.getAll(), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<MonHoc> add(@RequestBody MonHoc MonHoc){
        return new ResponseEntity<>(MonHocService.save(MonHoc), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MonHoc> edit(@PathVariable int id){
        MonHoc MonHoc = MonHocService.getById(id).get();
        if(MonHoc != null){
            return new ResponseEntity<>(MonHoc, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /*@GetMapping("/{id}")
    public ResponseEntity<MonHoc> getMonHoc(@PathVariable int id) {
        Optional<MonHoc> MonHocOptional = MonHocService.getById(id);
        return MonHocOptional.map(MonHoc -> new ResponseEntity<>(MonHoc, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }*/

    @PutMapping("/{id}")
    public ResponseEntity<MonHoc> doEdit(@PathVariable("id") int id, @RequestBody MonHoc MonHoc) {
        MonHoc MonHocNew = MonHocService.getById(id).get();
        if(MonHocNew != null){
            MonHoc.setId(MonHocNew.getId());
            MonHoc MonHocObject = MonHocService.save(MonHoc);
            return new ResponseEntity<>(MonHocObject, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MonHoc> deleteMonHoc(@PathVariable int id) {
        MonHoc MonHocNew = MonHocService.getById(id).get();
        if(MonHocNew != null){
            MonHocService.delete(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
