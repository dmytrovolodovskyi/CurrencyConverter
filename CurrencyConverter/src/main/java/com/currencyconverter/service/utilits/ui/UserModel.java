package com.currencyconverter.service.utilits.ui;

import lombok.Data;

@Data
public class UserModel {

    private String bank;
    private String currency;
    private String time;
    private String number;

    public UserModel() {
        this.currency = "USD";
        this.bank = "Privat";
        this.time = "Turn off notifications";
        this.number = "2";
    }
}
