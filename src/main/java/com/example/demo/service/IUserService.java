package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.pojo.dto.UserDto;

public interface IUserService {
//  插入用户
//    @params user
    User add(UserDto user);
    /**
     * 查询用户
     * @params id 用户id
     * @return
     */
    User getUser(Integer id);

    /**
     * 修改用户
     * @params user 要更新的用户信息
     * @return
     */
    User edit(UserDto user);

    /**
     * 删除用户
     *
     * @param id 要删除的用户id
     */
    void delete(Integer id);
}
