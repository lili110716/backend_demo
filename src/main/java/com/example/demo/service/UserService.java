package com.example.demo.service;

import com.example.demo.pojo.User;
import com.example.demo.pojo.dto.UserDto;
import com.example.demo.respository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service        //配制成spring的bean Service标识业务逻辑类的bean
public class UserService implements IUserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public User add(UserDto user){
        User userTemp = new User();
        BeanUtils.copyProperties(user,userTemp);
//        调用 数据访问类
        return userRepository.save(userTemp);
//        return userTemp;
    }

    @Override
    public User getUser(Integer id) {
        return userRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("用户不存在！参数异常！"));
    }

    @Override
    public User edit(UserDto user) {
        User userTemp = new User();
        BeanUtils.copyProperties(user,userTemp);
//        调用 数据访问类
        return userRepository.save(userTemp);
//        return null;
    }

    @Override
    public void delete(Integer id) {
         userRepository.deleteById(id);
//        return null;
    }

}
