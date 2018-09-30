package com.sergey.music.controller;

import com.sergey.music.Interfaces.FCMInterface.FCMInterface;
import com.sergey.music.entity.FcmUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class FCMController {

    @Autowired
    FCMInterface fcmInterface;

    @PostMapping("/fcmId")
    public void addMessage(@RequestParam(required = false) String fcmId){
        if(fcmInterface.findByfcmId(fcmId) == null){
            FcmUsers fcmUsers = new FcmUsers(fcmId);
            fcmInterface.saveFcmUser(fcmUsers);
        }
    }
}
