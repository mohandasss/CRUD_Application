package com.example.CRUDoperation.controller;

import com.example.CRUDoperation.entity.studentEntity;
import com.example.CRUDoperation.studentService.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


//controller to service to repository and repo is connected to database

@RestController
@RequestMapping("/CRUD")
public class studentcontroller {
    @Autowired
    private service service;

    @PostMapping("/save")
    public ResponseEntity<String> save(@RequestBody studentEntity studententity) {
        service.save(studententity);
        return ResponseEntity.status(HttpStatus.CREATED).body("Created");
    }

    @GetMapping("/get")
    public List<studentEntity> getallstudents() {
        return service.getallstudents();
    }

    @GetMapping("/findbyid/{id}")
    public Optional<studentEntity> findbyid(@PathVariable Long id) {
        return service.findbyid(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.OK).body("Deleted");
    }

    @PutMapping("/update")
    public String update(@RequestBody studentEntity student) {
        service.update(student);
        return "Updated";
    }

    @PutMapping("/updatebyid/{id}")
    public ResponseEntity<String> updateProductById(@PathVariable Long id, @RequestBody studentEntity student) {
        Boolean updated = service.updatestudentById(id, student);
        if (updated) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("Good");
        } else {
            return ResponseEntity.notFound().build();
        }

    }
}


