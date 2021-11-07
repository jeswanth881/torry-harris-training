package com.torryharris.entiretrainreservationprojectspringboot.repository;

import com.torryharris.entiretrainreservationprojectspringboot.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger,Integer> {
}
