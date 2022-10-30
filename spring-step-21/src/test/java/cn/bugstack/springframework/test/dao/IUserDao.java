package cn.bugstack.springframework.test.dao;

import cn.bugstack.springframework.test.po.User;

public interface IUserDao {

     User queryUserInfoById(Long id);

}
