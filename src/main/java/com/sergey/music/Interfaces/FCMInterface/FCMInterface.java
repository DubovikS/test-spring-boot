package com.sergey.music.Interfaces.FCMInterface;

import com.sergey.music.entity.FcmUsers;

import java.util.List;

public interface FCMInterface {
    List<FcmUsers> findAll();
    void saveFcmUser(FcmUsers fcmUsers);
    FcmUsers findByfcmId(String fcmId);
}
