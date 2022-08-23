package com.swd.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.swd.domain.User;

import java.util.List;

/**
 * @author SuWeiDong
 * @date 2022-08-22 15:25
 */
public interface UserService extends IService<User> {
   Boolean register(User user);
   List<User> getUserList();
}
