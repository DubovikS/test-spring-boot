package com.sergey.music.repository;

import com.sergey.music.entity.FcmUsers;
import org.springframework.data.repository.CrudRepository;

public interface FCMRepository extends CrudRepository<FcmUsers, Integer> {

    FcmUsers findByfcmId(String fcmId);
}
