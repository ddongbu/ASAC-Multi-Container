package com.asac.demo.controller;

import com.asac.demo.model.UserVO;
import com.asac.demo.repository.BasicRepository;
import com.asac.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api")
public class BasicController {
    @Autowired
    private UserService userService;
    //값 찾기
    @GetMapping("/user/")
    public List<UserVO> getAllUsers(){
        return userService.getAllUsers();
    }

    //특정값 찾기
    @GetMapping("/user/{id}")
    public Optional<UserVO> getById(@PathVariable Long id){
        return userService.getById(id);
    }

    //값 넣기
    @PostMapping("/users")
    public ResponseEntity<?> setUser(@RequestBody UserVO userVO){
        UserVO user = userService.saveUser(userVO);
        return ResponseEntity.ok(user);
    }

    //값 수정
    @PutMapping("/user/{username}")
    public ResponseEntity<?> update(@PathVariable String username, @RequestBody HashMap<String,String> map){
        UserVO user =userService.update(username,map.get("password"));
        return ResponseEntity.ok(user);
    }

    //값 삭제
    @DeleteMapping("/user/{username}")
    public ResponseEntity<?> deleteUser(@PathVariable String username){
        UserVO user  =   userService.delete(username);
        return ResponseEntity.ok(user);
    }
}
