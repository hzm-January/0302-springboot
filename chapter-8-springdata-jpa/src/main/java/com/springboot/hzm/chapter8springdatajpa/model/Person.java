package com.springboot.hzm.chapter8springdatajpa.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * Package: com.springboot.hzm.chapter8springdatajpa.model
 * Author: houzm
 * Date: Created in 2018/5/20 13:04
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description： TODO
 */
@Entity
@NamedQuery(name = "Person.withNameAndAgeQuery",
        query = "select p from Person p where p.name =?1 and p.age = ?2")
public class Person {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String age;
    private String address;

    public Person() {
    }

    public Person(String name, String age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
