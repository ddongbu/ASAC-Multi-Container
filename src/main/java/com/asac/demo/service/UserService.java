package com.asac.demo.service;

import com.asac.demo.model.UserVO;
import com.asac.demo.repository.BasicRepository;

import lombok.extern.java.Log;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private BasicRepository basicRepository;

    public Optional<UserVO> getById(Long id){
        return basicRepository.findById(id);
    }
    public List<UserVO> getAllUsers(){
        List<UserVO> userAll = basicRepository.findAll();
        return userAll;
    }
    public UserVO saveUser(UserVO userVO){
        return basicRepository.save(userVO);
    }
    public UserVO update(String username, String password){
        UserVO userVO = basicRepository.findByusername(username);
        userVO.setPassword(password);
        return basicRepository.save(userVO);
    }
    public UserVO delete(String username){
        UserVO userVO = basicRepository.findByusername(username);
        basicRepository.delete(userVO);
        return userVO;
    }
}
