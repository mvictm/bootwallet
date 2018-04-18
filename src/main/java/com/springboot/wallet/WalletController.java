package com.springboot.wallet;


import com.springboot.wallet.service.Wallet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/wallet")
public class WalletController {
    @Autowired
    Wallet wallet;

    @RequestMapping("/info")
    @ResponseBody
    String getStatus(){
        return "You have: "+wallet.getInfo();
    }

    @RequestMapping(value = "/deposit/{money}",method = RequestMethod.PUT)
    @ResponseBody
    String deposit(@PathVariable(name = "money") Integer money){
        wallet.depositMoney(money);
        return "You put " +money;
    }

    @RequestMapping("/{money}")
    @ResponseBody
    String withdraw(@PathVariable(name = "money") Integer money){
        return wallet.withdrawMoney(money);
    }
}
