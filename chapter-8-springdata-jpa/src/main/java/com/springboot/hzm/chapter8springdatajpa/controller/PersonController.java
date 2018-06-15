package com.springboot.hzm.chapter8springdatajpa.controller;

import com.springboot.hzm.chapter8springdatajpa.dao.PersonRepository;
import com.springboot.hzm.chapter8springdatajpa.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package: com.springboot.hzm.chapter8springdatajpa.controller
 * Author: houzm
 * Date: Created in 2018/5/20 13:28
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description： TODO
 */
@RestController
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/save")
    public Person save(Person person){
        Person p = personRepository.save(person);
        return p;
    };


}
