package com.cui.impl;

import com.cui.api.demodao;
import org.springframework.stereotype.Component;

@Component("dao")
public class demoimpl implements demodao {
    @Override
    public void test() {
        System.out.println("11111");
    }
}
