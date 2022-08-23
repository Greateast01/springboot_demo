package com.swd.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.swd.domain.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author SuWeiDong
 * @date 2022-08-22 15:22
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}
