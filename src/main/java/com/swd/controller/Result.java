package com.swd.controller;

import lombok.Data;

/**
 * @author SuWeiDong
 * @date 2022-08-22 15:34
 */
@Data
public class Result<T> {
    private Integer code;
    private String msg;
    private T data;

    public Result(){

    }

    public Result(Integer code,String msg){
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public Result(Integer code,String msg,T data){
        this(code,msg);
        this.data = data;
    }

}
