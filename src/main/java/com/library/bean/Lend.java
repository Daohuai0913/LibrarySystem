package com.library.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Lend implements Serializable {

    private long serNum;
    private long bookId;
    private long readerId;
    private Date lendDate;
    private Date backDate;


}
