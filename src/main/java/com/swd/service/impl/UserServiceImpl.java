package com.swd.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swd.dao.UserDao;
import com.swd.domain.User;
import com.swd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author SuWeiDong
 * @date 2022-08-22 15:25
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    private UserDao userDao;

    @Override

    public Boolean register(User user) {
        LambdaQueryWrapper<User> lqw = new LambdaQueryWrapper<>();

        lqw.eq(User::getUsername,user.getUsername());

        if(userDao.selectOne(lqw) == null){
            userDao.insert(user);
            System.out.println(Thread.currentThread().getName()+"==================注册成功=================");
            return true;
        }
        System.out.println(Thread.currentThread().getName()+"==================注册失败=================");
        return false;
    }

    @Override
    public List<User> getUserList() {

        return userDao.selectList(null);
    }


}
