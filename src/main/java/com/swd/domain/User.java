package com.swd.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author SuWeiDong
 * @date 2022-08-22 15:19
 */
@Data
@TableName("tb_user")
public class User {

    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String password;
}
