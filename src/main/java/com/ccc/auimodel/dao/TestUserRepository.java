package com.ccc.auimodel.dao;

import com.ccc.auimodel.pojo.TestUser;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Id;

/**
 * @Author: cyb
 * @Date: 2019-03-17 11:28
 * @Version 1.0
 */
public interface TestUserRepository extends JpaRepository<TestUser, Integer> {

}
