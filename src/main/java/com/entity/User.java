package com.entity;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.*;
import java.util.*;

@Entity
//@Data
//@Table(name="User")

@Document(collection = "User")
public class User {
    @Id
    private String id;

    @Field("name")
    private String name;

    @Field("address")
    private String address;

    @Field("CreateTime")
    private Date CreateTime;

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Date createTime) {
        CreateTime = createTime;
    }

    public User(String id, String name, String address, Date createTime) {
        this.id = id;
        this.name = name;
        this.address = address;
        CreateTime = createTime;
    }

    @Override
    public String toString() {
        return "user{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", CreateTime=" + CreateTime +
                '}';
    }
}


