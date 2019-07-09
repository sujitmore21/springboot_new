package com.sujit.newprojectspr.controller;

import com.sujit.newprojectspr.impl.MyImpl;
import com.sujit.newprojectspr.impl.MyImpl1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    // @Autowired
    private MyImpl myImpl;

//    public MyController(MyImpl myImpl){
//        this.myImpl=myImpl;
//    }

    @Autowired
    public void setMyImpl(MyImpl myImpl) {
        this.myImpl = myImpl;
    }

    @Autowired
    private MyImpl1 myImpl1;

    @GetMapping(value="/checkdata")
    public String checkData(){
        return myImpl.checkDiandIoc();
    }


    @GetMapping(value="/checkdata1")
    public String checkData1(){
        return myImpl1.check1();
    }
}