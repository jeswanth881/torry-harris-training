package com.torryharris.train.newtrain.repository;


import com.torryharris.train.newtrain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
}
