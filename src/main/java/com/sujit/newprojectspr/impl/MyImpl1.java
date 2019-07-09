package com.sujit.newprojectspr.impl;

import com.sujit.newprojectspr.myinterface.DemoInnterface1;
import org.springframework.stereotype.Service;

@Service
public class MyImpl1 implements DemoInnterface1 {
    @Override
    public String check1() {
        return "Hiiiiiiiiiiiii";
    }
}
