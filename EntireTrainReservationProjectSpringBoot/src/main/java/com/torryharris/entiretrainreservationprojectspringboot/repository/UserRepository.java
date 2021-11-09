package com.torryharris.entiretrainreservationprojectspringboot.repository;

import com.torryharris.entiretrainreservationprojectspringboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface UserRepository extends JpaRepository<User,Integer> {
}
