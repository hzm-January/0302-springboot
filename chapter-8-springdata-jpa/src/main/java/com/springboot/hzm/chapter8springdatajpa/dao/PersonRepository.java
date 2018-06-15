package com.springboot.hzm.chapter8springdatajpa.dao;

import com.springboot.hzm.chapter8springdatajpa.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Package: com.springboot.hzm.chapter8springdatajpa.dao
 * Author: houzm
 * Date: Created in 2018/5/20 13:09
 * Copyright: Copyright (c) 2018
 * Version: 0.0.1
 * Modified By:
 * Description： TODO
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

    /**
     * 姓名相等-查询
     * @return
     */
    List<Person> findByName(String name);

    /**
     * 根据姓名和地址查询
     * @param name
     * @param address
     * @return
     */
    List<Person> findByNameAndAddress(String name, String address);

    /**
     * 使用query查询，参数按照名称绑定
     * @param name
     * @param address
     * @return
     */
    @Query(value = "select p from Person p where p.name = :name and p.address = :address")
    List<Person> withNameAndAddressQuery(@Param("name") String name, @Param("address") String address);

    /**
     * 使用NamedQuery查询，注意实体类中定义的NamedQuery
     * @param name
     * @param age
     * @return
     */
    List<Person> withNameAndAgeQuery(String name, String age);
}
