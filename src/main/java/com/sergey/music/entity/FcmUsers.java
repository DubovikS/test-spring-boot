package com.sergey.music.entity;

import javax.persistence.*;

@Entity
public class FcmUsers {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String fcmId;

    public FcmUsers(String fcmId) {
        this.fcmId = fcmId;
    }

    public FcmUsers() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "fcm_id")
    public String getFcmId() {
        return fcmId;
    }

    public void setFcmId(String fcmId) {
        this.fcmId = fcmId;
    }
}
