package com.dalong.dnflogs.dnflogs.Entity;


import javax.persistence.*;

/**
 * Created by dalong on 04/11/2018.
 */

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cid;

    @Column(name = "nickname")
    private String nickname;

    public Long getCId() {
        return cid;
    }

    private void setCId(Long cid) {
        this.cid = cid;
    }
}
