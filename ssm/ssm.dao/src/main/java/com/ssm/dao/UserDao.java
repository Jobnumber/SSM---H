package com.ssm.dao;

import com.ssm.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ Description   :持久层接口
 * @ Author        :  1910959369@qq.com
 */

@Repository("userDao")
public interface UserDao {
    public void saveUser(User user);
    public List<User>findAllUser();
}
