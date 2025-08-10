package com.example.demo.respository;

import com.example.demo.pojo.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
//Springjpa的接口会自动帮我们实现

@Repository     //spring bean Repository标识数据访问的bean
public interface UserRepository extends CrudRepository <User,Integer>{
}
