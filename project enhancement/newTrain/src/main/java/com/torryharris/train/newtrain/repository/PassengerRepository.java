package com.torryharris.train.newtrain.repository;


import com.torryharris.train.newtrain.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
}
