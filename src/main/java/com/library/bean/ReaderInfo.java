package com.library.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReaderInfo implements Serializable {

    private long readerId;
    private String name;
    private String sex;
    private Date birth;
    private String address;
    private String phone;



}
