package com.example.demo.serviceImpl;

import com.example.demo.dao.User;
import com.example.demo.entity.UserEntity;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserEntity userEntity;
    @Override
    public User findById(Integer id) {
        Optional<User> op =  userEntity.findById(id);
        if(op == null){
            return null;
        }
        return op.get();
    }
}
