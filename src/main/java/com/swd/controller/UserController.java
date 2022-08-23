package com.swd.controller;

import com.swd.domain.User;
import com.swd.service.AsyncExecutorService;
import com.swd.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author SuWeiDong
 * @date 2022-08-22 15:32
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private AsyncExecutorService asyncExecutorService;


    @GetMapping("/list")
    public Result<?> getUserList(){
        long start = System.currentTimeMillis();
        asyncExecutorService.asyncTest();
        List<User> userList = userService.getUserList();
        long end = System.currentTimeMillis();
        System.out.println("=============================");
        System.out.println("cost =========================> "+(end-start)+"ms");
        return new Result<>(200,"查询成功",userList);
    }


    @PostMapping("/register")
    public Result<?> register(@RequestBody User user){

        return userService.register(user) ?
                new Result<>(200,"注册成功") :
                new Result<>(200,"用户名已存在");
    }

}
