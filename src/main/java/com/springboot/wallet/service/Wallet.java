package com.springboot.wallet.service;

/**
 * Created by 1 on 17.04.2018.
 */
public interface Wallet {
    Integer getInfo();

    void depositMoney(Integer money);

    String withdrawMoney(Integer money);
}
