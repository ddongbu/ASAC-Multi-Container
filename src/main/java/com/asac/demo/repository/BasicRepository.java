package com.asac.demo.repository;

import com.asac.demo.model.UserVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BasicRepository extends JpaRepository<UserVO,Long> {
    public UserVO findByusername(String username);
    public UserVO deleteByusername(String username);

}
