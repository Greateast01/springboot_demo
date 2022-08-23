package com.swd.service.impl;

import com.swd.service.AsyncExecutorService;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author SuWeiDong
 * @date 2022-08-23 8:35
 */
@Service
public class AsyncExecutorServiceImpl implements AsyncExecutorService {

    @Override
    @Async("taskExecutor")
    public void asyncTest()  {
        System.out.println("============================线程:"+Thread.currentThread().getName()+"异步执行5秒==========================");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
