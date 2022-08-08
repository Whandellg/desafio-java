package com.spdata.ccliente.dto;

import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class PacientDto {

    @NotNull
    //@Size(max=50)
    private String name;

    @NotNull
    //@Size(max=11)
    private String cpf;

    @NotNull
    @DateTimeFormat(pattern = "dd/mm/yyyy")
    private Date datanasc;

    @NotNull
    //@Size(max=1)
    private String sex;

    @NotNull
    //@Size(max=1)
    private String gestant;




}
