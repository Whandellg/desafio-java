package com.nitech.spdata.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.Date;

@Table
@Data
@Entity
@Generated
public class PacientEntity {
   @Id
   @GeneratedValue (strategy = GenerationType.IDENTITY)
   private Integer id;
    private String name;
    private String cpf;
    private Date datanasc;
    private String sex;
    private String gestant;



}
