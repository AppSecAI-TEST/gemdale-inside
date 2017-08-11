package com.inside.member.model;

import com.inside.common.model.BasePojo;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


/**
 * Created by Ethan on 2017/8/9.
 */
@Table(name = "users")
public class Users extends BasePojo implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;          //唯一标识

    private String nickName; //昵称

    private String avatar; //头像

    private String phone; //电话

    private Short sex; //性别 1.男 2.女

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }


    public Users() {
    }

    public Users(String nickName, String avatar, String phone, Short sex) {
        this.nickName = nickName;
        this.avatar = avatar;
        this.phone = phone;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", avatar='" + avatar + '\'' +
                ", phone='" + phone + '\'' +
                ", sex=" + sex +
                '}';
    }
}
