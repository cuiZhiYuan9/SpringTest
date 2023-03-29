package com.cui.util;

import com.cui.Pojo.RuleTest;

import java.util.logging.Logger;

public class RuleUtil {
    public static boolean chooseretrun(String flag, RuleTest ruleTest) {
        switch (flag) {
            case "1":
                ruleTest.setFalg("111"); return true;
            case "2":
                ruleTest.setFalg("2");return true;
            case "3":
                ruleTest.setFalg("3");return true;
        }
        return false;
    }
}
