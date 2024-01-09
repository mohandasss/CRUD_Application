package com.example.CRUDoperation.studentService;

import com.example.CRUDoperation.entity.studentEntity;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.*;

public interface service  {

    void save(studentEntity studententity);
    List<studentEntity> getallstudents();

    Optional<studentEntity> findbyid(Long id);

    public  String delete( long id);
    public String update(studentEntity student );
    public Boolean updatestudentById(Long id,studentEntity student);




}
