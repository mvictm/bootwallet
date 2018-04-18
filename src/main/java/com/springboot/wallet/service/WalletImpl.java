package com.springboot.wallet.service;

import org.springframework.stereotype.Service;

/**
 * Created by 1 on 17.04.2018.
 */

@Service
public class WalletImpl implements Wallet {
    private Integer money = 0;

    @Override
    public Integer getInfo() {
        return money;
    }

    @Override
    public void depositMoney(Integer money) {
        this.money += money;
    }

    @Override
    public String withdrawMoney(Integer money) {
        if(money > this.money){
            return "Sorry, you don't enough money. Please up balance. Your balance:" + this.money;
        }
        return "Successful withdraw: " + money;
    }
}
