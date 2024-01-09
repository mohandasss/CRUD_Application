package com.example.CRUDoperation.studentService;

import com.example.CRUDoperation.entity.studentEntity;
import com.example.CRUDoperation.repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class studentserviceimpl implements service {
    @Autowired
   private studentRepository studentrepository;
    @Override
    public void save(studentEntity studententity) {
        studentrepository.save(studententity);
    }

    @Override
    public List<studentEntity> getallstudents() {
       return studentrepository.findAll();
    }

    @Override
    public Optional<studentEntity> findbyid(Long id) {
        return studentrepository.findById(id);
    }

    @Override
    public String delete(long id) {
        studentrepository.deleteById(id);
        return "done";
    }

    @Override
    public String update(studentEntity student) {
         studentrepository.save(student);
         return "updated";
    }

    @Override
    public Boolean updatestudentById(Long id, studentEntity student) {
        if (studentrepository.existsById(id)) {
            student.setId(id);
            studentrepository.save(student);

        }

        return false;
    }

}
