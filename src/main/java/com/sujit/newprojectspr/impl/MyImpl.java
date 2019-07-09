package com.sujit.newprojectspr.impl;


import com.sujit.newprojectspr.myinterface.DemoInterface;
import org.springframework.stereotype.Service;

@Service
public class MyImpl implements DemoInterface {

    @Override
    public String checkDiandIoc() {
        return "Hello Spring";
    }
}
