package com.cui.Service;

import com.cui.api.demodao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Service")
public class DemoService {

    @Autowired
    private demodao dao;

    public void show() {
        dao.test();
    }

    public static boolean ComPareID(String orgIDNO, String AppntIDNO) {
        String tempNo = "";
        if (orgIDNO.length() == 15 && AppntIDNO.length() == 18) {
            tempNo = AppntIDNO;
            AppntIDNO = AppntIDNO.substring(0, 6) + tempNo.substring(8, 17);
        } else if (orgIDNO.length() == 18 && AppntIDNO.length() == 15) {
            tempNo = orgIDNO;
            orgIDNO = orgIDNO.substring(0, 6) + tempNo.substring(8, 17);
        }

        return AppntIDNO.equals(orgIDNO);
    }


    }

