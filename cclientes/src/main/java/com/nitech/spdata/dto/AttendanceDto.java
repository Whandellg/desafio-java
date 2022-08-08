package com.nitech.spdata.dto;

import com.sun.istack.NotNull;

import java.security.Timestamp;

public class AttendanceDto {


    @NotNull
    private Integer pacient_id;

    @NotNull
    private Integer situacao_id;

    @NotNull
    private Timestamp datahoraatend;

    @NotNull
    private String diagnostic;

    @NotNull
    private Timestamp datahoraencer;

    @NotNull
    private Timestamp duration;

}
