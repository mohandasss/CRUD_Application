package com.example.CRUDoperation.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class studentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "sqgen")
    @SequenceGenerator(name = "sqgen",sequenceName = "sqgen1",allocationSize = 1,initialValue = 1)
    private long id;
    private String name;
    private String course;


}
