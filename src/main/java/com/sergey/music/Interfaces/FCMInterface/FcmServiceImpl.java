package com.sergey.music.Interfaces.FCMInterface;

import com.sergey.music.entity.FcmUsers;
import com.sergey.music.repository.FCMRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FcmServiceImpl implements FCMInterface {

    @Autowired
    FCMRepository fcmRepository;

    @Override
    public List<FcmUsers> findAll() {
        return (List<FcmUsers>) fcmRepository.findAll();
    }

    @Override
    public void saveFcmUser(FcmUsers fcmUser) {
        fcmRepository.save(fcmUser);
    }

    @Override
    public FcmUsers findByfcmId(String fcmId) {
        return fcmRepository.findByfcmId(fcmId);
    }
}
