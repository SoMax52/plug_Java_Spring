package com.example.newMock.model;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Random;

@Data

public class ResponseDTO {

    public String rqUID;
    public String clientId;
    public String account;
    public String currency;
    public Integer balance;
    public Integer maxLimit;

}
