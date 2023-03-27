package com.cui.Service;

import com.cui.api.demodao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Service")
public class DemoService {

    @Autowired
    private demodao dao;
    public void show(){
        dao.test();
    }
}
