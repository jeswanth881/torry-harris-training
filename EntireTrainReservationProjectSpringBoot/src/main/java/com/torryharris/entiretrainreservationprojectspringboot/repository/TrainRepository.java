package com.torryharris.entiretrainreservationprojectspringboot.repository;

import com.torryharris.entiretrainreservationprojectspringboot.model.Train;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainRepository extends JpaRepository<Train,Integer> {
}
